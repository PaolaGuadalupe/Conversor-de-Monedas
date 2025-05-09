<h1 align="center"> Conversor de Monedas </h1>

![Java](https://img.shields.io/badge/Java-ED8B00?logo=java&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?logo=intellijidea)
![Status](https://img.shields.io/badge/Estado-En%20Desarrollo-yellow)
![Platform](https://img.shields.io/badge/Plataforma-Windows%20%7C%20Linux-lightgrey)
![Uso](https://img.shields.io/badge/Uso-Educativo-orange)
![Versión](https://img.shields.io/badge/Versión-1.0-blue)

Este proyecto es una aplicación de consola en Java que permite convertir montos entre diferentes monedas usando datos en tiempo real proporcionados por la API [ExchangeRate-API](https://www.exchangerate-api.com/).

---

## 🧩 Características de la aplicación

✅ Conversión de monedas en tiempo real usando la API de ExchangeRate API.

✅ Interfaz de línea de comandos amigable para el usuario.

✅ Visualización de tasas de cambio actualizadas.

✅ Validación de entrada para evitar errores comunes.

✅ Preparada para futuras funciones como historial de conversiones.

---

## 🛠️ Requisitos

- JDK 17 o superior
- IDE (como IntelliJ IDEA, VSCode o NetBeans)
- Conexión a internet (para consultar la API)
- Una cuenta gratuita en [ExchangeRate-API](https://www.exchangerate-api.com/) para obtener tu API Key

---

## 💱 Ejemplo de conversión exitosa:

![Conversión realizada](assets/ConversionDeMoneda.PNG)


## 🛠 Tecnologías utilizadas                                                                                                                

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge\&logo=java\&logoColor=white)                                    Lenguaje principal del proyecto                     

![IntelliJ IDEA](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-blue?style=for-the-badge\&logo=intellijidea\&logoColor=white)       Entorno de desarrollo usado  

![Gson](https://img.shields.io/badge/Gson-JSON--parser-brightgreen?style=for-the-badge)                                               Librería para el manejo de JSON  

![ExchangeRate API](https://img.shields.io/badge/API-ExchangeRate-blue?style=for-the-badge)                                           API para obtener las tasas de cambio en tiempo real

![HTTP Client](https://img.shields.io/badge/Java%20HttpClient-red?style=for-the-badge)                                                Cliente HTTP de Java para consumir APIs REST        


## 🚀 Cómo ejecutar

1. **Clona o descarga** este repositorio.
2. **Agrega tu API Key** en la clase `Config.java`:

```java
public class Config {
    public static String getApiKey() {
        return "TU_API_KEY_AQUI"; // Reemplaza con tu clave real
    }
}


