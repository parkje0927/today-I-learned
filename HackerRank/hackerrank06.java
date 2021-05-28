import java.util.Stack;

public class hackerrank06 {
    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int hike = 0;
        int answer = 0;

        Stack<Integer> s = new Stack<>();
        for (int i=0;i<steps;i++) {
            if (path.charAt(i) == 'U') {
                hike += 1;
            }
            else {
                hike -= 1;
            }

            if (s.size() == 0 && hike == -1) {
                s.push(i);
            }
            else if (s.size() > 0 && hike == 0) {
                answer++;
                s.pop();
            }
        }

        return answer;
    }
}
