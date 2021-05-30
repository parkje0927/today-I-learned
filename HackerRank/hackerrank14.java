public class hackerrank14 {
    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
        int answer = 0;

        for (int i=0;i<s.length()-1;i++) {
            // pick 
            for (int j=1;j<=s.length()-i-1;j++) {
                String temp1 = s.substring(i, i+j);
                char[] ch1 = temp1.toCharArray();
                Arrays.sort(ch1);
                temp1 = String.valueOf(ch1);

                int start = i+1;
                int end = start + j;

                while (true) {
                    String temp2 = s.substring(start, end);
                    char[] ch2 = temp2.toCharArray();
                    Arrays.sort(ch2);
                    temp2 = String.valueOf(ch2);
                    
                    if (temp1.equals(temp2)) {
                        answer++;
                    }
                    start++;
                    end++;
                    if (end > s.length()) {
                        break;
                    }
                }
            }
        }

        return answer;
    }
}
