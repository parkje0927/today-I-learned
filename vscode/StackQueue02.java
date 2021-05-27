import java.util.ArrayList;

class StackQueu02 {
    public int solution(int[] priorities, int location) {
        
        int answer = 0;

        ArrayList<Integer> p = new ArrayList<>(); 
        ArrayList<Integer> idx = new ArrayList<>();

        for (int i=0;i<priorities.length;i++) {
            p.add(priorities[i]);
            idx.add(i);
        }

        int s = 0;
        while (true) {
            int flag = 0;
            for (int i=s+1;i<p.size();i++) {
                if (p.get(s) < p.get(i)) {
                    int temp = p.get(s);
                    p.remove(s);
                    p.add(temp);

                    temp = idx.get(s);
                    idx.remove(s);
                    idx.add(temp);
                    
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                s++;
            }

            if (s == priorities.length - 1) {
                break;
            }
        }
        
        for (int i=0;i<idx.size();i++) {
            if (idx.get(i) == location) {
                answer = i + 1;
            }
        }

        return answer;
        
        
        
        
        
//         int answer = 0;
        
//         Vector <Integer> v = new Vector<>();
//         Vector <Integer> idx = new Vector<>();
        
//         for (int i=0;i<priorities.length;i++) { 
//             v.add(priorities[i]);
//             idx.add(i);
//         }    
        
//         int cnt = 0;
//         int s = 0;
//         while (true) {
//             int flag = 0;
//             for (int j=s+1;j<v.size();j++) {
//                 if (v.get(s) < v.get(j)) {

//                     int temp = v.get(s);
//                     v.remove(s);
//                     v.add(temp);

//                     temp = idx.get(s);
//                     idx.remove(s);
//                     idx.add(temp);
                    
//                     flag = 1;
//                 }           
                
//                 if (flag == 1) {
//                     break;
//                 }
//             }
            
//             if (flag == 0) {
//                 s++;
//             }    
            
//             cnt++;
//             if (s == v.size() - 1) {
//                 break;
//             }
//         }

//         for (int i=0;i<idx.size();i++) {
//             if (idx.get(i) == location) {
//                 answer = i+1;
//                 break;
//             }
//         }
        
        
//         return answer;
    }
}
