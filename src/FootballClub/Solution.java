package FootballClub;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Дано: список футбольных команд.
// Pacположить команды по принципу: страны в алфавитном порядке и количество очков (от максимума).

public class Solution {
    public List<FootballClub> receiveSortedListOfTeams(List<FootballClub> list) {
        return list.stream()
                .sorted(Comparator.comparing(FootballClub::getCountry)
                        .thenComparing((FootballClub f1,FootballClub f2) -> f2.getAchievedPoint()-f1.getAchievedPoint())).
                                collect(Collectors.toList());
    }
}
