import java.util.ArrayList;

public class hackerrank07 {
    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        /*
        n의 개수만큼 list에 add
        */
        long answer = 0;
        //문자열에서 특정 문자의 개수 세기
        long count = s.chars().filter(c -> c == 'a').count();
        
        int end = 0;
        if (s.length() == n) {
            answer = count;
            return answer;
        } else if (s.length() < n) {
            long a = (long)n / s.length();
            long b = n - (s.length() * a);

            answer += (count * a);
            if (b == 0) {
                return answer;
            } else {
                n = b;
            }
        }
        int idx = 0;
        
        while (true) {
            if (s.charAt(idx) == 'a') {
                answer++;
            }

            idx++;
            n -= 1;

            if (idx == s.length()) {
                idx = 0;
            }
            if (n == 0) {
                break;
            }
        }

        return answer;
    }
}
