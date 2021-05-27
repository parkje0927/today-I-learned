import java.util.HashMap;

//보석 쇼핑  
public class intern04 {

    public static void main(String[] args) {
            String[] gems = {"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"};
            int[] answer = new int[2];
    
            HashMap<String, Integer> map = new HashMap<>();
            for (int i=0;i<gems.length;i++) {
                map.put(gems[i], -1);
            }
    
            int min = gems.length + 100;
            int start = 0;
            int end = 0;
    
            int front = 0;
            int rear = gems.length - 1;
            while (true) {
                for (int i=front;i<=rear;i++) {
                    map.put(gems[i], front);
                }
    
                int flag = 0;
                for (String key : map.keySet()) {
                    if (map.get(key) != front) {
                        flag = 1;
                        break;
                    }
                }

                for (String key : map.keySet()) {
                    System.out.println(key + " " + map.get(key));
                }
                System.out.println(flag);
    
                if (flag == 0) {
                    if (min > rear - front) {
                        min = rear - front;
                        start = front + 1;
                        end = rear + 1;
    
                        answer[0] = start;
                        answer[1] = end;
                    }
                }
                front++;
                rear--;
                if (front > rear) {
                    break;
                }
            }
    
            for (int i=0;i<2;i++) {
                System.out.println(answer[i]);
            }
        }
    
}
