package numbersPointsInCut;

import java.util.*;
import java.util.stream.Collectors;

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
    public Map<Integer, Integer> getNumbersOfTimesPointHitsInCut(List<Integer> points, List<Cut> cuts) {
        Map<Integer, Integer> result = new HashMap<>();
        //step 1: sort points
        List<Integer> sortedPoints = points.stream().sorted().collect( Collectors.toList() );
        System.out.println( sortedPoints );
        // step 2: sort cuts
        List<Cut> sortedCuts = cuts.stream().sorted( Comparator.comparing( Cut::getLeft ) ).collect( Collectors.toList() );

        // step 3: use Deque for cuts
        Deque<Cut> deque = new ArrayDeque<>( sortedCuts );

        // step 4: check if the point is in the segment
        do {
            for (Integer point : sortedPoints) {
                if (deque.getFirst().getLeft() <= point && deque.getFirst().getRight() >= point) {
                    result.merge( point, 1, (oldVal, newVal) -> oldVal + 1 );
                }
            }
            deque.removeFirst();
        } while (!deque.isEmpty());
        return result;
    }
}
