import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class hackerrank19 {
    /*
     * Complete the 'activityNotifications' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY expenditure
     *  2. INTEGER d
     */

    static double findMedian(int[] arr, int d) {
        double median = 0;
        int first = 0;
        int second = 0;

        int cnt = 0;
        if (d % 2 == 1) {
            for (int i=0;i<arr.length;i++) {
                if (arr[i] > 0) {
                    cnt += arr[i];

                    if (cnt > (d / 2)) {
                        median = i;
                        return median;
                    }
                }
            }
        } else {
            for (int i=0;i<arr.length;i++) {
                if (arr[i] > 0) {
                    cnt += arr[i];

                    if (first == 0 && cnt >= (d / 2)) {
                        first = i;
                    }
                    if (second == 0 && cnt >= (d / 2) + 1) {
                        second = i;
                    }
                }

                if (first != 0 && second != 0) {
                    break;
                }
            }

            median = (double)(first + second) / (double)2;
        }

        return median;
    }

    public static int activityNotifications(List<Integer> expenditure, int d) {
    // Write your code here
    /*
        If there is an odd number of values, 
        the middle one is picked. 
        If there is an even number of values, 
        the median is then defined to be the average of the two middle values.
    */
        int answer = 0;
        int[] arr = new int[201];

        if (d == expenditure.size()) {
            return answer;
        }

        for (int i=0;i<d;i++) {
            arr[expenditure.get(i)]++;
        }

        int index = 0;
        for (int i=d;i<expenditure.size();i++) {
            double median = findMedian(arr, d);

            if (expenditure.get(i) >= median * 2) {
                System.out.println(median);
                answer++;
            }

            arr[expenditure.get(index++)]--;
            arr[expenditure.get(i)]++;
        }

        // ArrayList<Integer> list = new ArrayList<>();
        // for (int i=0;i<expenditure.size();i++) {
        //     if (list.size() != d) {
        //         list.add(expenditure.get(i));
        //     } else {
        //         double medianNum = 0;
        //         ArrayList<Integer> tempList = list;
        //         Collections.sort(tempList);
        //         int medianIdx = (int)tempList.size() / 2;
        //         int medianIdx2 = (int)(tempList.size() / 2) - 1;

        //         // odd
        //         if (d % 2 == 1) {
        //             medianNum = tempList.get(medianIdx);
        //         } 
        //         // even
        //         else {
        //             medianNum = (double)(tempList.get(medianIdx) + tempList.get(medianIdx2)) / (double)2;
        //         }

        //         System.out.println("medianNum = " + medianNum);

        //         if (expenditure.get(i) >= medianNum*2) {
        //             answer++;
        //         }
        //         list.remove(0);
        //         list.add(expenditure.get(i));
        //     }
        // }

        return answer;
    }
}
