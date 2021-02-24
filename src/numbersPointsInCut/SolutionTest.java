package numbersPointsInCut;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution=new Solution();

    @Test
    void getNumbersOfTimesPointHitsInCut_test1() {
        List<Integer> points = Arrays.asList(10, 3, 6, 9, 1);
        List<Cut> cuts= Arrays.asList( new Cut( 5, 10 ),
                new Cut( 2, 7 ));
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put( 3, 1 );
        expected.put( 6, 2 );
        expected.put( 9, 1 );
        expected.put( 10, 1 );

        Map<Integer, Integer> actual = solution.getNumbersOfTimesPointHitsInCut(points, cuts);
        assertEquals(expected ,actual);
    }

    @Test
    void getNumbersOfTimesPointHitsInCut_test2() {
        List<Integer> points = Arrays.asList( 3 );
        List<Cut> cuts = Arrays.asList(
                new Cut( 2, 7 ) );
        Map<Integer, Integer> expected = new HashMap<>();
        expected.put( 3, 1 );

        Map<Integer, Integer> actual = solution.getNumbersOfTimesPointHitsInCut( points, cuts );
        assertEquals( expected, actual );

    }
}
