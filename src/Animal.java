import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

// Абстрактный класс Animal
@AllArgsConstructor
public abstract class Animal {
    protected Location location;
    protected int weight;
    protected int maxCount;
    protected int speed;
    protected double foodNeed;
    protected boolean isAlive;
    protected int hunger;
    protected int catchChance;

    public abstract void eat();
    public abstract void move();
    public abstract void reproduce();
    //public abstract void die();
}

