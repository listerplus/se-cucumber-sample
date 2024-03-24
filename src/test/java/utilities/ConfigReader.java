package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static String url;
    private static String browser;

    static {
        Properties prop = new Properties();
        try (InputStream input = new FileInputStream("src/test/java/utilities/config.properties")) {
            prop.load(input);
            url = prop.getProperty("url");
            browser = prop.getProperty("browser");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String getUrl() {
        return url;
    }

    public static String getBrowser() {
        return browser;
    }
}