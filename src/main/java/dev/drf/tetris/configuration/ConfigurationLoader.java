package dev.drf.tetris.configuration;

import dev.drf.tetris.core.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public final class ConfigurationLoader {
    private ConfigurationLoader() {
    }

    public static Configuration load() {
        ResourceConfiguration configuration = new ResourceConfiguration();
        try (InputStream input = ConfigurationLoader.class.getClassLoader().getResourceAsStream("config.properties")) {

            Properties prop = new Properties();

            if (input == null) {
                return configuration;
            }

            prop.load(input);

            configuration.setWidth(
                    stringToInt(prop.getProperty("tetris.map.width"))
            );
            configuration.setHeight(
                    stringToInt(prop.getProperty("tetris.map.height"))
            );

        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return configuration;
    }

    private static int stringToInt(String value) {
        return Integer.parseInt(value);
    }
}
