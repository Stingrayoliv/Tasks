package numbers_and_interval_21_01_13;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

// сложность O(n^2)
/*
Есть List<Integer> отсортированных чисел. Есть еще одно число, символизирующее длину некоего отрезка.
Найти максимальное количество точек на этой прямой, которые можно покрыть этим отрезком.
*int maxCoveredPoint(List<Integer> numbers, int cut)
**List<Integer>{10,15,20,31,40,55,58,64}, cut=9 -> maxCoveredPoint = 3    (55,58,64)
 */

public class Solution {

    /**
     * The function finds the largest amount of numbers from the list which
     * are covered by an interval of the length 'interval'
     *
     * @param numbers  should be a sorted list of ints
     * @param interval a value which reflect the length of the interval. Must be
     *                 non negative
     * @return
     */
    public int solve(List<Integer> numbers, int interval) {
        if (numbers.isEmpty() || interval == 0)
            return 0;

        Deque<Integer> intervalQueue = new ArrayDeque<>();
        int max = 0;
        for (int number : numbers) {
            intervalQueue.addLast(number);

            while (number - intervalQueue.getFirst() > interval) {
                intervalQueue.removeFirst();
            }

            if (max < intervalQueue.size())
                max = intervalQueue.size();
        }

        return max;
    }
}
