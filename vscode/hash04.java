import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//베스트앨범
class hash04 {

    public int[] solution(String[] genres, int[] plays) {
        //int[] answer = {};

        HashMap<String, Integer> genreAndPlayMap = new HashMap<>();

        for (int i=0;i<genres.length;i++) {
            String key = genres[i];
            genreAndPlayMap.put(key, genreAndPlayMap.getOrDefault(key, 0) + plays[i]);
        }

        ArrayList<String> keySetList = new ArrayList<>(genreAndPlayMap.keySet()); 
        Collections.sort(keySetList, (o1, o2) -> (genreAndPlayMap.get(o2).compareTo(genreAndPlayMap.get(o1))));
        ArrayList<Integer> temp = new ArrayList<>();

        for (String key : keySetList) {

            HashMap<Integer, Integer> indexAndPlayMap = new HashMap<>();

            for (int i=0;i<plays.length;i++) {
                if (key.equals(genres[i])) {
                    indexAndPlayMap.put(i, plays[i]);
                }
            }

            ArrayList<Integer> keySetList2 = new ArrayList<>(indexAndPlayMap.keySet()); 
            Collections.sort(keySetList2, (o1, o2) -> (indexAndPlayMap.get(o2).compareTo(indexAndPlayMap.get(o1))));
            
            int count = 0;
            for (Integer key2 : keySetList2) {
                temp.add(key2);
                count++;
                if (count == 2) {
                    break;
                }
            }
        }

        int[] answer = new int[temp.size()];
        for (int i=0;i<temp.size();i++) {
            answer[i] = temp.get(i).intValue();
        }
        return answer;
    }
    
}
