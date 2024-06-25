package abstraction;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalParameters {
    private String type;
    private int weight;
    private int max_count;
    private int speed;
    private int hunger;
    private Map<String, Integer> catchChance;
}
