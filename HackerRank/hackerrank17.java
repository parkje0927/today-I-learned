import java.util.List;

public class hackerrank17 {
    /*
     * Complete the 'maximumToys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY prices
     *  2. INTEGER k
     */

    public static int maximumToys(List<Integer> prices, int k) {
    // Write your code here
        int answer = 0;
        
        Collections.sort(prices);
        for (int i=0;i<prices.size();i++) {
            if (k >= prices.get(i)) {
                k -= prices.get(i);
                answer++;
            }
        }

        return answer;
    }
}
