import java.util.HashMap;
import java.util.List;

class hackerrank04 {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int answer = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<ar.size();i++) {
            map.put(ar.get(i), map.getOrDefault(ar.get(i), 0) + 1);
            if (map.get(ar.get(i)) == 2) {
                map.put(ar.get(i), 0);
                answer++;
            }
        }

        return answer;
    }
}
