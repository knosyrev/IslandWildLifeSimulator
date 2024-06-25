package entity;

import abstraction.LifeUnit;

// Класс entity.Plant (Растение)
public class Plant implements LifeUnit {
    private Location location;

    public Plant(Location location) {
        this.location = location;
    }

    public void grow() {
        // Растение растет с 20% вероятностью
        if (Math.random() < 0.2) {
            new Plant(location);
        }
    }

    public void die() {
        // Растение умирает
        location.setLifeUnit(null);
    }
}
