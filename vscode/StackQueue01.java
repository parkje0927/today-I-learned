import java.util.ArrayList;
import java.util.Stack;

//기능개발
public class StackQueue01 {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        
        ArrayList<Integer> countList = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for (int i=0;i<speeds.length;i++) {
            int temp = (int)Math.ceil((100 - progresses[i]) / (double)speeds[i]);
            
            if (stack.size() == 0) {
                stack.push(temp);
                cnt ++;
            } else {
                if (stack.peek() < temp) {
                    stack.push(temp);
                    countList.add(cnt);
                    cnt = 1;
                } else {
                    cnt++;
                }
            }
            if (i == speeds.length - 1) {
                countList.add(cnt);
            }
        }
        answer = new int[countList.size()];
        for (int i=0;i<countList.size();i++) {
            answer[i] = countList.get(i);
        }
         
        return answer;
    }
}
