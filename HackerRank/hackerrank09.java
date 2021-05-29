import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hackerrank09 {
    /*
     * Complete the 'rotLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER d
     */

    public static List<Integer> rotLeft(List<Integer> a, int d) {
    // Write your code here
        List<Integer> q = new LinkedList<>();
        for (int i=0;i<a.size();i++) {
            q.add(a.get(i));
        }
        for (int i=0;i<d;i++) {
            int temp = q.remove(0);
            q.add(temp);
        }

        return q;
    }
}
