import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    protected Properties properties;

    public ReadProperties() {
        properties = new Properties();
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getBrowserName() {
        return properties.getProperty( "browserType");
    }

    public boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }
}
