
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import dto.IslandConfig;

import java.io.File;
import java.io.IOException;

public class Island {


    public void start() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        IslandConfig islandConfig = objectMapper.readValue(new File("res/config/map/island.yaml"), IslandConfig.class);
        System.out.println(String.format("Width: %s \nLength: %s", islandConfig.getWidth(), islandConfig.getLength()));
    }
}
