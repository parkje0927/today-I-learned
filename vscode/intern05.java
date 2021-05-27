import java.util.HashMap;
import java.util.HashSet;

//불량 사용자 -> dfs 로 풀기
public class intern05 {

    boolean visited[];


    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;

        HashMap<String, Integer> ids = new HashMap<>();
        HashSet<String> set = new HashSet<>();
        for (int i=0;i<user_id.length;i++) {
            ids.put(user_id[i], 1);
        }
        //dfs
        for (int i=0;i<banned_id.length;i++) {
           
        }


        
        for (int i=0;i<banned_id.length;i++) {
            int len = banned_id[i].length();
            for (int j=0;j<user_id.length;j++) {
                if (ids.get(user_id[j]) == 0) {
                    continue;
                }

                int flag = 0;
                if (user_id[j].length() == len) {
                    for (int k=0;k<len;k++) {
                        if (banned_id[i].charAt(k) == '*') {
                            continue;
                        } else if (banned_id[i].charAt(k) != user_id[j].charAt(k)) {
                            flag = 1;
                            break;
                        }
                    }
                }

                if (flag == 1) {
                    break;
                } else {
                    ids.put(user_id[j], 0);
                    set.add(user_id[j]);
                }
            }
        }




        return answer;
    }
}
