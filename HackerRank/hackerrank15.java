import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class hackerrank15 {
    // Complete the countTriplets function below.
    
    // combination
    static long answer = 0;
    static void comb(List<Long> arr, boolean[] visited, int start, int r, long mul) {
        if (r == 0) {
            long num = 0;
            int idx = 0;
            int count = 1;
            for (int i=0;i<arr.size();i++) {
                if (visited[i]) {
                    num = arr.get(i);
                    idx = i;
                    break;
                }
            }
            for (int i=idx+1;i<arr.size();i++) {
                if (visited[i]) {
                    if (arr.get(i) == num*mul) {
                        num = arr.get(i);
                        count++;
                        if (count == 3) {
                            answer++;
                            break;
                        }
                    }
                }
            }
        }
        for (int i=start;i<arr.size();i++) {
            visited[i] = true;
            comb(arr, visited, i+1, r-1, mul);
            visited[i] = false;
        }
    }

    static long countTriplets(List<Long> arr, long r) {
        
        // i) combination
        // boolean[] visited = new boolean[arr.size()];
        // comb(arr, visited, 0, 3, r);

        // ii) for
        // for (int i=0;i<arr.size()-2;i++) {
        //     long num = arr.get(i);
        //     int idx = i+1;
        //     int cnt = 1;
        //     for (int j=idx;j<arr.size();j++) {
        //         if (arr.get(j) == (num*r)) {
        //             num = arr.get(j);
        //             cnt++;
        //             if (cnt == 3) {
        //                 answer++;
        //                 break;
        //             }
        //         }
        //     }
        // }

        // iii) hashmap 
        // HashMap<Long, Integer> map = new HashMap<>();
        // for (int i=0;i<arr.size();i++) {
        //     map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        // }
        // for (Long k : map.keySet()) {
        //     System.out.println(k + " " + map.get(k));
        // }
        // ArrayList<Long> key = new ArrayList<>(map.keySet());
        // Collections.sort(key);

        // for (int i=0;i<key.size()-2;i++) {
        //     long number = (long)key.get(i);
        //     int count = map.get((long)key.get(i));
        //     int cnt = 1;

        //     for (int j=i+1;j<i+3;j++) {    
        //         if ((long)key.get(j) == number * r) {
        //             count *= map.get((long)key.get(j));
        //             number = (long)key.get(j);
        //             cnt++;
        //         }
        //     }
        //     answer += cnt == 3 ? count : 0;
        // }

        // referred by discussion (***)
        HashMap<Long, Long> hash2 = new HashMap<>();
        HashMap<Long, Long> hash3 = new HashMap<>();

        for (int i=0;i<arr.size();i++) {
            answer += hash3.getOrDefault(arr.get(i), 0L);

            if (hash2.containsKey(arr.get(i))) {
                hash3.put(arr.get(i)*r, hash3.getOrDefault(arr.get(i)*r, 0L) + hash2.get(arr.get(i)));
            }

            hash2.put(arr.get(i)*r, hash2.getOrDefault(arr.get(i)*r, 0L) + 1);
        }

        return answer;
    }
}
