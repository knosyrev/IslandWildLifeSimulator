package abstraction;

import entity.Location;
import entity.Plant;

import java.util.List;

// Класс abstractions.Herbivore (Травоядное)
public abstract class Herbivore extends Animal {
    public Herbivore(Location location, int weight, int maxCount, int speed, double foodNeed) {
        super(location, weight, maxCount, speed, foodNeed);
    }

    @Override
    public void eat() {
        // Есть растения
        List<Plant> plants = location.getPlant();
        if (plants != null) {
//            plants.die();
            hunger -= 5;
        }
    }
}
