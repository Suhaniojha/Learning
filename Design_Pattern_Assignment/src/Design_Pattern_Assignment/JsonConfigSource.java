package Design_Pattern_Assignment;

import java.util.HashMap;
import java.util.Map;

public class JsonConfigSource implements ConfigSource
{
    private final String filePath;
    public JsonConfigSource(String filePath){
        this.filePath=filePath;
    }

    @Override
    public Map<String, String> readConfig() {
        Map<String,String> config=new HashMap<>();

        config.put("database","mysql");

        config.put("port","3306");

        return config;
    }
}
