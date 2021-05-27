import java.util.ArrayList;
import java.util.Stack;

//수식 최대화
public class intern02 {

    Stack<String> stack = new Stack<>();
    int result = 0;
    int finalResult = 0;

    public void getResult(ArrayList<String> arr, String expression) {
        //후위 연산식으로 만들기
        ArrayList<String> postFix = new ArrayList<>();
        Stack<String> opStack = new Stack<>();
        Stack<String> calStack = new Stack<>();
        String num = "";

        for (int i=0;i<expression.length();i++) {
            boolean checkOp = false;
            for (int j=0;j<arr.size();j++) {
                
            }
        }


    }

    public void permutation(ArrayList<String> arr, int depth, int n, int r, String expression) {
        if (depth == r) {
            getResult(arr, expression);
            return;
        } 

        for (int i=depth;i<n;i++) {
            swap(arr, depth, i);
            permutation(arr, depth + 1, n, r, expression);
            swap(arr, depth, i);
        }
    }

    public void swap(ArrayList<String> arr, int depth, int i) {
        String temp = arr.get(depth);
        arr.set(depth, arr.get(i));
        arr.set(i, temp);
    }

    public long solution(String expression) {
        long answer = 0;

        //1. expression 을 list로 분리하기
        ArrayList<String> operation = new ArrayList<>();
        for (int i=0;i<expression.length();i++) {
            String exp = String.valueOf(expression.charAt(i));

            if (stack.isEmpty()) {
                stack.push(exp);
            } else {
                if (stack.peek().equals("*") || 
                stack.peek().equals("+") || 
                stack.peek().equals("-")) {
                    stack.push(exp);

                    if (!operation.contains(exp)) {
                        operation.add(exp);
                    }

                } else {
                    String temp = stack.pop();
                    temp += exp;
                    stack.push(temp);
                }
            }
        }

        //2. 연산자 우선순위 조합을 구하고 조합대로 hashmap 에 저장하기
        int n = operation.size();
        int r = operation.size();
        permutation(operation, 0, n, r, expression);

        //3. hashmap과 list를 넘겨서 계산해오기
        answer = finalResult;
        return answer;
    }
}
