package FootballClub;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    public void receiveSortedListOfTeams() {
        List<FootballClub> list = Arrays.asList(
                new FootballClub("Germany", "teamGermany1", 5),
                new FootballClub("Germany", "teamGermany2", 100),
                new FootballClub("Brazil", "BrazilTeam1", 300),
                new FootballClub("Australian", "team1", 15));
        List<FootballClub> actual = solution.receiveSortedListOfTeams(list);

        List<FootballClub> expected = Arrays.asList(new FootballClub("Australian", "team1", 15),
                new FootballClub("Brazil", "BrazilTeam1", 300),
                new FootballClub("Germany", "teamGermany2", 100),
                new FootballClub("Germany", "teamGermany1", 5));
        assertEquals(expected, actual);
    }

    @Test
    public void oneCountyWithDifferentTeams_receiveSortedListOfTeams() {
        List<FootballClub> list = Arrays.asList(
                new FootballClub("Germany", "teamGermany1", 5),
                new FootballClub("Germany", "teamGermany2", 100),
                new FootballClub("Germany", "teamGermany3", 1),
                new FootballClub("Germany", "teamGermany4", 600));

        List<FootballClub> actual = solution.receiveSortedListOfTeams(list);

        List<FootballClub> expected = Arrays.asList(new FootballClub("Germany", "teamGermany4", 600),
                new FootballClub("Germany", "teamGermany2", 100),
                new FootballClub("Germany", "teamGermany1", 5),
                new FootballClub("Germany", "teamGermany3", 1));
        assertEquals(expected, actual);
    }
}
