package CountLastTenMinutes;

import java.time.LocalDateTime;
import java.util.*;

//public class StatisticsService {
//
//    public ArrayList<Integer> last10minutesMentions(List<Statistics> statisticsList){
//        Map<String, Deque<LocalDateTime>> mentionsNumberByUrl=new HashMap<>();
//        List<Integer> res = new ArrayList<>();
//
//        for(Statistics statistics:statisticsList){
//            Deque<LocalDateTime> deque=mentionsNumberByUrl.get(statistics.getUrl());
//            if (deque==null){
//                deque=new ArrayDeque<>();
//                mentionsNumberByUrl.put(statistics.getUrl(), deque);
//            }
//
//            deque.addLast(statistics.getTime());
//
//            while (deque.getFirst().isBefore(statistics.getTime().minusMinutes(10))){
//                deque.removeFirst();
//            }
//
//            res.add(deque.size());
//        }
//        return res;
//    }
//}
