package taskPointsAndCuts;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();

    @Test
    void getNumbersOfTimesPointInCuts_test1() {
        List<Integer> numbers = Arrays.asList(10, 3, 6, 9, 1);
        List<Cut> cuts= Arrays.asList( new Cut( 5, 10 ),
                new Cut( 2, 7 ));
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put( 1, 0 );
        expected.put( 3, 1 );
        expected.put( 6, 2 );
        expected.put( 9, 1 );
        expected.put( 10, 1 );

        Map<Integer, Integer> actual = solution.getNumbersOfTimesPointInCuts(numbers, cuts);
        assertEquals(expected ,actual);
    }

    @Test
    void getNumbersOfTimesPointInCuts_PointHasKindsInTheSameTime_test3() {
        List<Integer> numbers = Arrays.asList( 3 );
        List<Cut> cuts = Arrays.asList(
                new Cut( 1, 3 ),
                new Cut (2, 10),
                new Cut(3, 9));
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put( 3, 3);

        Map<Integer, Integer> actual = solution.getNumbersOfTimesPointInCuts( numbers, cuts );
        assertEquals( expected, actual );
    }

    @Test
    void getNumbersOfTimesPointInCuts_OneNumberInOneCuts_test2() {
        List<Integer> numbers = Arrays.asList( 3 );
        List<Cut> cuts = Arrays.asList(
                new Cut( 2, 7 ) );
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put( 3, 1 );

        Map<Integer, Integer> actual = solution.getNumbersOfTimesPointInCuts( numbers, cuts );
        assertEquals( expected, actual );
    }
}
