import java.util.Arrays;

public class intern08 {

    int MIN = 100;

    public void getResult(String begin, boolean[] visited, String target, String[] words, int count) {
        
        if (begin.equals(target)) {
            if (MIN > count) {
                MIN = count;
            }
            return;
        }
        
        for (int i=0;i<words.length;i++) {
            if (!visited[i]) {
                int len = words[i].length();
                int cnt = 0;
                for (int j=0;j<len;j++) {
                    if (words[i].charAt(j) == begin.charAt(j)) {
                        cnt++;
                    }
                }

                if (cnt == len - 1) {
                    visited[i] = true;
                    getResult(words[i], visited, target, words, count + 1);
                    visited[i] = false;
                }
            }
        }

    }

    public int solution(String begin, String target, String[] words) {
        int answer = 0;
        boolean[] visited = new boolean[words.length];

        if (!Arrays.asList(words).contains(target)) {
            return answer;
        }

        for (int i=0;i<words.length;i++) {
            int len = words[i].length();
            int cnt = 0;

            for (int j=0;j<len;j++) {
                if (words[i].charAt(j) == begin.charAt(j)) {
                    cnt++;
                }
            }

            if (cnt == len - 1) {
                visited[i] = true;
                getResult(words[i], visited, target, words, 1);
            }
        }

        answer = MIN;
        return answer;
    }
}
