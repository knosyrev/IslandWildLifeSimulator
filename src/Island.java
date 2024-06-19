import services.initialization.IslandCreator;

public class Island {
    int fieldWidth;
    int fieldLength;

    public IslandCreator Island(int x, int y) {
        this.fieldWidth = x;
        this.fieldLength = y;
        return new IslandCreator(x, y);
    }
}
