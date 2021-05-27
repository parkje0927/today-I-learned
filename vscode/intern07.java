import java.util.LinkedList;
import java.util.Queue;

public class intern07 {
    
    public static Queue<Pair> q = new LinkedList<>();

    public static void dfs(boolean[][] visited, int[][] computers, int yy) {
        // while (!q.isEmpty()) {
        //     Pair p = q.poll();

        //     int yy = p.x;
        //     for (int j=0;j<computers[yy].length;j++) {
        //         if (yy != j && computers[yy][j] == 1 && !visited[yy][j]) {
        //             computers[yy][j] = 0;
        //             visited[yy][j] = true;
        //             q.add(new Pair(yy, j));
        //             //bfs(visited, computers);
        //         }
        //     }
        // }
        
        for (int j=0;j<computers[yy].length;j++) {
            if (yy != j && computers[yy][j] == 1 && !visited[yy][j]) {
                computers[yy][j] = 0;
                visited[yy][j] = true;
                dfs(visited, computers, j);
            }
        }

    }

    public int solution(int n, int[][] computers) {
        int answer = 0;
        int a = computers.length;
        int b = computers[0].length;
        boolean[][] visited = new boolean[a][b];
        for (int i=0;i<computers.length;i++) {
            for (int j=0;j<computers[i].length;j++) {
                visited[i][j] = false;
            }
        }

        for (int i=0;i<computers.length;i++) {
            for (int j=0;j<computers[i].length;j++) {
                if (i != j && computers[i][j] == 1 && !visited[i][j]) {
                    computers[i][j] = 0;
                    visited[i][j] = true;

                    answer++;
                    q.add(new Pair(i, j));
                    dfs(visited, computers, j);
                    q.clear();
                }
            }
        }
        return answer;
    }

    static class Pair {
        int y, x;
        Pair(int y, int x) {
            this.y = y;
            this.x = x;
        }
    }
}

