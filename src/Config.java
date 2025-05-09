import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {
    public static String getApiKey() {
        Properties props = new Properties();
        try{
            props.load(new FileInputStream("config.properties"));
            return props.getProperty("API_KEY");
        } catch (IOException e) {
            throw new RuntimeException("No se pudo leer el archivo de configuración");
        }
    }
}
