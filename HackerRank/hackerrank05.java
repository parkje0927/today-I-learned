import java.util.List;

public class hackerrank05 {
    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here
        int answer = 0;
        int idx = 0;
        while (true) {    
            if (idx + 2 <= c.size() - 1 && c.get(idx + 2) == 0) {
                answer++;
                idx += 2;
            } else if (idx + 1 <= c.size() - 1 && c.get(idx + 1) == 0) {
                answer++;
                idx += 1;
            }
            
            if (idx == c.size() - 1) {
                break;
            }
        }
        
        return answer;
    }
}
