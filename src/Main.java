import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Bienvenido/a al conversor de monedas\n");
            System.out.println("***************");
            System.out.println("Digite la opción que desea realizar:");
            System.out.println("1) Realiza una conversión");
            System.out.println("2) Consulta historial de conversiones");
            System.out.println("3) Salir");
            System.out.println("***************");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    realizarConversion();
                    break;
                case 2:
                    System.out.println("Funcionalidad de historial aún no implementada.");
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el conversor de monedas!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (opcion != 3);
    }

    public static void realizarConversion() throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Leer API key desde clase Config
        String apiKey = Config.getApiKey();

        // Pedir moneda base y destino
        System.out.println("\nDigite la moneda base (ej. USD, EUR, MXN): ");
        String monedaBase = scanner.nextLine().toUpperCase();

        System.out.println("Digite la moneda a la que desea convertir (ej. USD, EUR, MXN): ");
        String monedaDestino = scanner.nextLine().toUpperCase();

        // Construir URL de la API
        String url = "https://v6.exchangerate-api.com/v6/" + apiKey + "/latest/" + monedaBase;

        // Crear cliente HTTP y solicitud
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();

        // Enviar solicitud
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Procesar JSON
        JsonObject jsonResponse = JsonParser.parseString(response.body()).getAsJsonObject();
        JsonObject conversionRates = jsonResponse.getAsJsonObject("conversion_rates");

        // Verificar si moneda destino existe
        if (conversionRates.has(monedaDestino)) {
            System.out.println("Ingrese la cantidad que desea convertir desde " + monedaBase + ":");
            double cantidadBase = scanner.nextDouble();

            double tasaConversion = conversionRates.get(monedaDestino).getAsDouble();
            double cantidadConvertida = cantidadBase * tasaConversion;

            System.out.printf("\n%.2f %s equivale a %.2f %s\n", cantidadBase, monedaBase, cantidadConvertida, monedaDestino);
        } else {
            System.out.println("Moneda destino no válida o no disponible en la API.");
        }
    }
}
