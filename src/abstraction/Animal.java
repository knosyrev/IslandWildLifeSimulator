package abstraction;

import constant.LifeType;
import entity.Location;
import lombok.AllArgsConstructor;

// Абстрактный класс abstractions.Animal
@AllArgsConstructor
public abstract class Animal implements LifeUnit {
    protected Location location;
    protected int weight;
    protected int maxCount;
    protected int speed;
    protected double foodNeed;
    protected boolean isAlive;
    protected int hunger;
    protected int catchChance;

    public Animal(Location location, int weight, int maxCount, int speed, double foodNeed) {
    }

    public void createAnimal(LifeType type) {
         switch (type){
            case WOLF -> System.out.println("Wolf!");
            default -> System.out.println("other type");
        };
    }

    public abstract void eat();
    public abstract void move();
    public abstract void reproduce();
    //public abstract void die();
}

