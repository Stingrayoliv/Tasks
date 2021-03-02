package taskPointsAndCuts;

public class Cut {
    private int left;
    private int right;

    public Cut( int left, int right) {

        this.left = left;
        this.right = right;
    }

    public int getRight() {
        return right;
    }

    public int getLeft() {
        return left;
    }

    @Override
    public String toString() {
        return "Cut{" +
                "right=" + right +
                ", left=" + left +
                '}';
    }
}
