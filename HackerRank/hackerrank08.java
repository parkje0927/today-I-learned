import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class hackerrank08 {
    /*
     * Complete the 'hourglassSum' function below.
     *s
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        //6X6 행렬
        int answer = 0;

        int[][] array = new int[6][6];
        for (int i=0;i<arr.size();i++) {
            List<Integer> temp = arr.get(i);
            for (int j=0;j<temp.size();j++) {
                array[i][j] = temp.get(j);
            }
        }

        ArrayList<Integer> list = new ArrayList<>(); 
        int y = 0;
        int x = 0;
        for (int i=0;i<=3;i++) {
            for (int j=0;j<=3;j++) {
                y = i;
                x = j;
                int sum = 0;
                for (int k=y;k<y+3;k++) {
                    for (int l=x;l<x+3;l++) {
                        if (k == y+1) {
                            sum += array[k][x+1];
                            break;
                        } else {
                            sum += array[k][l];
                        }
                    }
                }
                list.add(sum);
            }
        }
        answer = Collections.max(list);

        return answer;
    }
}
