package entity;

import abstraction.Animal;

import java.util.ArrayList;
import java.util.List;

// Класс entity.Location (Локация)
public class Location {
    private List<Animal> animals;
    private List<Plant> plants;
    private List<Location> neighbors;

    public Location() {
        this.neighbors = new ArrayList<>();
    }

    public void setAnimal(Animal animal) {
        this.animals = animals;
    }

    public void setPlant(Plant plant) {
        this.plants = plants;
    }

    public List<Animal> getPrey() {
        // Получить случайное животное в локации
        return animals;
    }

    public List<Plant> getPlant() {
        // Получить растение в локации
        return plants;
    }

    public Location getRandomNeighbor() {
        // Получить случайного соседа
        return neighbors.get((int) (Math.random() * neighbors.size()));
    }
}
