// Классы конкретных животных
public class Wolf extends Predator {
    public Wolf(Location location) {
        super(location, 50, 30, 3, 8);
    }

    @Override
    public void move() {
        // Волк может передвигаться на 3 клетки
        location = location.getRandomNeighbor();
    }

    @Override
    public void reproduce() {
        // Волк может размножаться с 50% вероятностью
        if (Math.random() < 0.5) {
            new Wolf(location);
        }
    }
}
