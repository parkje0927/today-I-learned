import java.util.Arrays;

public class hackerrank13 {
    /*
     * Complete the 'twoStrings' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. STRING s1
     *  2. STRING s2
     */

    public static String twoStrings(String s1, String s2) {
    // Write your code here
        String answer = "NO";

        // String to Char
        char[] ch1 = s1.toCharArray();
        Arrays.sort(ch1);
        char[] ch2 = s2.toCharArray();
        Arrays.sort(ch2);

        int idx1 = 0;
        int idx2 = 0;

        while (true) {
            if (ch1[idx1] == ch2[idx2]) {
                answer = "YES";
                return answer;
            } else if (ch1[idx1] < ch2[idx2]) {
                idx1++;
            } else if (ch1[idx1] > ch2[idx2]) {
                idx2++;
            }
            
            if (idx1 == ch1.length || idx2 == ch2.length) {
                break;
            }
        }
  
        return answer;
    }
}
