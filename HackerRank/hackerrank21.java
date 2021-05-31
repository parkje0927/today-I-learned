import java.util.Arrays;

class hackerrank21 {

    /*
     * Complete the 'makeAnagram' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING a
     *  2. STRING b
     */

    public static int makeAnagram(String a, String b) {
    // Write your code here
        int answer = 0;
        char ch1[] = a.toCharArray();
        Arrays.sort(ch1);

        char ch2[] = b.toCharArray();
        Arrays.sort(ch2);
        
        int idx1 = 0;
        int idx2 = 0;
        answer = ch1.length + ch2.length;
        while (true) {
            if (ch1[idx1] == ch2[idx2]) {
                answer -= 2;
                idx1++;
                idx2++;
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