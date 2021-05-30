import java.util.List;

public class hackerrank10 {
    /*
     * Complete the 'minimumBribes' function below.
     *
     * The function accepts INTEGER_ARRAY q as parameter.
     */

    public static void minimumBribes(List<Integer> q) {
    // Write your code here
        int count = 0;
        
        for (int i=0;i<q.size();i++) {
            if (q.get(i) - (i + 1) > 2) {
                System.out.println("Too chaotic");
                return;
            }
        }

        // bubble sort -> time exceed
        for (int i=0;i<q.size();i++) {
            int flag = 0;
            for (int j=0;j<q.size()-i-1;j++) {
                if (q.get(j) > q.get(j+1)) {
                    flag = 1;
                    count++;

                    int temp = q.get(j);
                    q.set(j, q.get(j+1));
                    q.set(j+1, temp);
                }
            }
            if (flag == 0) {
                break;
            }
        }

        System.out.println(count);
    }
}
