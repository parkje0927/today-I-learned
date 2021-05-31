public class hackerrank22 {
    /*
     * Complete the 'alternatingCharacters' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int alternatingCharacters(String s) {
    // Write your code here
        int answer = 0;

        char fir = s.charAt(0);
        for (int i=1;i<s.length();i++) {
            if (fir == s.charAt(i)) {
                answer++;
            } else {
                fir = s.charAt(i);
            }
        }

        return answer;
    }
}
