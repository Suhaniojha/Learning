package Design_Pattern_Assignment;

import java.util.HashMap;
import java.util.Map;

public class PropertiesConfigSource implements ConfigSource {
    private final String filePath;
    public PropertiesConfigSource(String filePath){
        this.filePath = filePath;
    }

    @Override
    public Map<String, String> readConfig() {
        Map<String, String> map = new HashMap<>();
        map.put("database","mySql");
        map.put("Port","8080");

        return map;
    }
}
