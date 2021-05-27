import java.util.Arrays;

//튜플
public class intern03 {
    public int[] solution(String s) {
        int[] answer = {};

        String [] strs = s.replaceAll("[{}]", " ").trim().split(" ,");
        Arrays.sort(strs, (s1, s2) -> (s1.length() - s2.length()));
        answer = new int[strs.length];
        int idx = 0;

        for (int i=0;i<strs.length;i++) {
            String tempStr = "";
            tempStr = strs[i].trim();
            
            if (i == 0) {
                answer[idx++] = Integer.parseInt(tempStr);
            } else {
                String[] temp = tempStr.split(",");

                for (int j=0;j<temp.length;j++) {
                    int flag = 0;
                    int value = Integer.parseInt(temp[j]);

                    for (int k=0;k<answer.length;k++) {
                        if (answer[k] == value) {
                            flag = 1;
                        }
                    }
                    if (flag == 0) {
                        answer[idx++] = value;
                    }
                    // if (!Arrays.asList(answer).contains(value)) {
                    //     answer[idx++] = value;
                    //     break;
                    // }
                }
            }
        }

        return answer;
    }
}
