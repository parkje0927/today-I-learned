/*
순열
순열은 순서에 따라 결과가 달라지는 방식
즉, {1, 2, 3}, {1, 3, 2}, {2, 1, 3} 모두 다른 결과를 가져온다. 
순서가 다르기 때문이다.
https://bcp0109.tistory.com/14
*/
public class Permutation {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int[] output = new int[n];
        boolean[] visited = new boolean[n];

        //arr.length 개 중에서 i개 뽑는 순열
        for (int i=1;i<=arr.length;i++) {
            permutation(arr, output, visited, 0, n, i);
        }
    }

    static void permutation(int [] arr, int[] output, boolean[] visited, int depth, int n, int r) {
        if (depth == r) {
            print(output, r);
            return;
        }

        for (int i=0;i<n;i++) {
            if (visited[i] != true) {
                visited[i] = true;
                output[depth] = arr[i];
                permutation(arr, output, visited, depth+1, n, r);
                visited[i] = false;
            }
        }
    }

    static void print(int[] arr, int r) {
        for (int i=0;i<r;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
