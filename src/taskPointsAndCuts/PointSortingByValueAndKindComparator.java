package taskPointsAndCuts;

import java.util.Comparator;

public class PointSortingByValueAndKindComparator implements Comparator<Point> {
    @Override
    public int compare(Point p1, Point p2) {
        if (p1.getValue() == p2.getValue())
            return p1.getKind().compareTo( p2.getKind() );
        return p1.getValue() - p2.getValue();
    }
}
