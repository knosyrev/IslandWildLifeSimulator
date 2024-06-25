package dto;

import abstraction.AnimalParameters;
import constant.LifeType;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Map;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AnimalConfig {
    Map<LifeType, AnimalParameters> animalConfig;
}
