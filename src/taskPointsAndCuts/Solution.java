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

        // add points to List
        List<Point> points = new ArrayList<>();
        for (Integer number : numbers) {
            points.add( new Point( number, Poinkind.POINT ) );
        }
        for (Cut cut : cuts) {
            points.add( new Point( cut.getLeft(), Poinkind.BEGIN ) );
            points.add( new Point( cut.getRight(), Poinkind.END ) );
        }

        // sort Points (if values are the same - compare kinds of the points)
        Comparator<Point> byValueAndKind = new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.getValue() == p2.getValue())
                    return p1.getKind().compareTo( p2.getKind() );
                return p1.getValue() - p2.getValue();
            }
        };
        points.sort( byValueAndKind );

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
}
