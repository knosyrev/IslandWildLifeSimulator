package entity;

import abstraction.Animal;
import abstraction.LifeUnit;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Location {
    List<LifeUnit> lifeUnits;
    Integer x;
    Integer y;

    public Location(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

}
