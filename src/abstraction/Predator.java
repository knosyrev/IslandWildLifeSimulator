package abstraction;

import entity.Location;

import java.util.List;

// Класс abstraction.Predator (Хищник)
public abstract class Predator extends Animal {
    public Predator(Location location, int weight, int maxCount, int speed, double foodNeed) {
        super(location, weight, maxCount, speed, foodNeed);
    }

    @Override
    public void eat() {
        // Есть других животных
        List<Animal> prey = location.getPrey();
        if (prey != null) {
//            prey.die();
            hunger -= 5;
        }
    }
}
