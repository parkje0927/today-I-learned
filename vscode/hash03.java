//위장
import java.util.*;

class hash03 {

    public int solution(String[][] clothes) {
        int answer = 1;

        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i< clothes.length;i++) {
            String key = clothes[i][1];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }

        for (String key : map.keySet()) {
            answer *= (map.get(key) + 1);
        }
        answer -= 1;

        return answer;
    }
}
