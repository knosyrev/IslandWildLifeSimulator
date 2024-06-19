import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.Getter;

import java.util.List;

// Класс Predator (Хищник)
public abstract class Predator extends Animal {
    public Predator(Location location, int weight, int maxCount, int speed, double foodNeed, int catchChance) {
        super(location, weight, maxCount, speed, foodNeed, true, catchChance);
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
