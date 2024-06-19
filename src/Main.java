import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import lombok.AllArgsConstructor;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        Yaml yaml = new Yaml();
//        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("animals.yaml");
//        IslandConfig config = yaml.loadAs(inputStream, IslandConfig.class);

        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());
        objectMapper.readValue(new File("res/animals.yaml"), IslandConfig.class);
        System.out.println(objectMapper);
    }
}

@AllArgsConstructor
class IslandConfig {
    private Island island;
    private List<AnimalConfig> animals;

    // getters an…Úd setters
}

class AnimalConfig {
    private String type;
    private int weight;
    private int max_count;
    private int speed;
    private int hunger;
    private Map<String, Integer> catchChance;

    // getters and setters
}