import java.util.List;

public class hackerrank16 {
    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
    // Write your code here
        int count = 0;
        for (int i=0;i<a.size();i++) {
            for (int j=0;j<a.size()-i-1;j++) {
                if (a.get(j) > a.get(j+1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    count++;
                }
            }
        }
        
        int first = a.get(0);
        int last = a.get(a.size()-1);

        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + first);
        System.out.println("Last Element: " + last);
    }
}
