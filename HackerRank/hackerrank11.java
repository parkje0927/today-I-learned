public class hackerrank11 {
    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int answer = 0;

        for (int i=0;i<arr.length-1;i++) {
            if (arr[i] != i+1) {
                answer++;

                for (int j=i+1;j<arr.length;j++) {
                    if (arr[j] == i+1) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }

        }

        return answer;

    }
}
