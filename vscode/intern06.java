//타겟넘버
public class intern06 {

    int answer = 0;

    public int solution(int[] numbers, int target) {
        
        //조합
        int n = numbers.length;
        boolean[] visited = new boolean[n];

        for (int r=1;r<=n;r++) {
            comb(numbers, visited, 0, n, r, target);
        }

        return answer;
    }

    void comb(int[] numbers, boolean[] visited, int start, int n, int r, int target) {
        if (r == 0) {
            int sum = 0;
            for (int i=0;i<n;i++) {
                if (visited[i] == true) {
                    sum -= numbers[i];
                } else {
                    sum += numbers[i];
                }
            }
            if (sum == target) {
                answer++;
            }

            return;
        }
        else {
            for (int i=start;i<n;i++) {
                visited[i] = true;
                comb(numbers, visited, i + 1, n, r - 1, target);
                visited[i] = false;
            }
        }
    }
}