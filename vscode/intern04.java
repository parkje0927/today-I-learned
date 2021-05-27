import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

//보석 쇼핑  
public class intern04 {
    public int[] solution(String[] gems) {
        //int[] answer = new int[2];

        HashMap<String, Integer> map = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (String s : gems) {
            set.add(s);
        }
        
        int start = 0;
        int tempStr = 0;
        int len = gems.length;
        Queue<String> q = new LinkedList<>();

        for (int i=0;i<gems.length;i++) {
            map.put(gems[i], map.getOrDefault(gems[i], 0) + 1);

            q.add(gems[i]);
            while (true) {
                String gem = q.peek();
                if (map.get(gem) > 1) {
                    map.put(gem, map.get(gem) - 1);
                    q.poll();
                    tempStr++;
                } else break;
            }

            if (map.size() == set.size()) {
                if (len > q.size()) {
                    len = q.size();
                    start = tempStr;
                }
            }
        }
        return new int[] {start + 1, start + len};
    }
}
