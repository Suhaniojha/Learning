package Design_Pattern_Assignment;

import java.util.HashMap;
import java.util.Map;

public class YamlConfigSource implements ConfigSource {

    private final String filePath;

    public YamlConfigSource(String filePath){
        this.filePath=filePath;
    }

    @Override
    public Map<String, String> readConfig() {
        Map<String,String> map=new HashMap<>();

        map.put("database","postgres");

        map.put("port","5432");

        return map;
    }
}
