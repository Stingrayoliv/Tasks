package taskPointsAndCuts;

public class Point {
    private int value;
    private Poinkind kind;

    public Point(int value, Poinkind kind) {
        this.value = value;
        this.kind = kind;
    }

    public int getValue() {
        return value;
    }

    public Poinkind getKind() {
        return kind;
    }
}
