public class Rabbit extends Herbivore {
    public Rabbit(Location location) {
        super(location, 2, 150, 2, 0.45);
    }

    @Override
    public void move() {
        // Кролик может передвигаться на 2 клетки
        location = location.getRandomNeighbor();
    }

    @Override
    public void reproduce() {
        // Кролик может размножаться с 80% вероятностью
        if (Math.random() < 0.8) {
            new Rabbit(location);
        }
    }
}
