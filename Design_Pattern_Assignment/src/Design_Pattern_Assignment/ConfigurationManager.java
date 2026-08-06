package Design_Pattern_Assignment;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {

    private static volatile ConfigurationManager instance;

    private final Map<String, String> configMap;

    private ConfigSource currentSource;

    private ConfigurationManager() {
        configMap = new HashMap<>();
    }

    public static ConfigurationManager getInstance() {

        if (instance == null) {

            synchronized (ConfigurationManager.class) {

                if (instance == null) {

                    instance = new ConfigurationManager();

                }

            }

        }

        return instance;

    }

    public void setConfig(String key, String value) {
        configMap.put(key, value);
    }

    public String getConfig(String key) {
        return configMap.get(key);
    }

    public void loadFromSource(ConfigSource source) {

        currentSource = source;

        configMap.clear();

        configMap.putAll(source.readConfig());

    }

    public void refreshConfig() {

        if (currentSource != null) {

            System.out.println("Refreshing Configuration...");

            configMap.clear();

            configMap.putAll(currentSource.readConfig());

        }

    }

    public void displayAllConfig() {

        System.out.println("\nCurrent Configuration");

        for (Map.Entry<String, String> entry : configMap.entrySet()) {

            System.out.println(entry.getKey() + " = " + entry.getValue());

        }

    }

}