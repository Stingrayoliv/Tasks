package taskPointsAndCuts;

import java.util.*;
/*
Есть лист объектов "Отрезок":
class Cut{
   int left;
   int right;
}
Дан лист int numbers.
Вернуть Map<Integer, Integer> ключами которого являются числа из листа (int), а значения - это кол-во отрезков,
покрывающих это число. Map<Integer, Integer> solve (List<Cut> cuts, List<Integer> numbers)
 */

public class Solution {
    public Map<Integer, Integer> getNumbersOfTimesPointInCuts(List<Integer> numbers, List<Cut> cuts) {
        Map<Integer, Integer> result = new HashMap<>();
        int counter = 0;

        List<Point> points=getSortedListOfPoints(numbers, cuts);

        for (Point point : points) {
            if (point.getKind() == Poinkind.BEGIN)
                counter++;
            else if (point.getKind() == Poinkind.END)
                counter--;
            else
                result.put( point.getValue(), counter );
        }
        return result;
    }

    public List<Point> getSortedListOfPoints(List<Integer> numbers, List<Cut> cuts){
        List<Point> points = new ArrayList<>();
        for (Integer number : numbers) {
            points.add( new Point( number, Poinkind.POINT ) );
        }
        for (Cut cut : cuts) {
            points.add( new Point( cut.getLeft(), Poinkind.BEGIN ) );
            points.add( new Point( cut.getRight(), Poinkind.END ) );
        }
        // sort Points (if values are the same - compare kinds of the points)
        points.sort( new PointSortingByValueAndKindComparator() );
        return points;
    }
}
