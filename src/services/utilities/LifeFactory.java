package services.utilities;

import abstraction.Animal;
import constant.LifeType;

public class LifeFactory {
    public Animal createLifeUnit(LifeType type) {
        return new Animal(type);
    }
}
