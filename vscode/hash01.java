//완주하지 못한 선수
import java.util.Arrays;

class hash01 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i=0;i<participant.length-1;i++) {
            if (!participant[i].equals(completion[i])) {
                answer = participant[i];
                return answer;
            }
        }
        
        answer = participant[participant.length - 1];
        return answer;
    }
}