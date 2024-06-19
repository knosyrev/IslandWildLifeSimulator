package entity;

import abstraction.Nature;

// Класс entity.Plant (Растение)
public class Plant implements Nature {
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
        location.setPlant(null);
    }
}
