//키패드 누르기
public class intern01 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int [][] map = new int [4][3];
        int num = 1;
        for (int i=0;i<3;i++) {
            for (int j=0;j<3;j++) {
                map[i][j] = num;
                num++;
            }
        }
        map[3][0] = 99;
        map[3][1] = 0;
        map[3][2] = 99;

        //초기 위치
        int lefty = 3;
        int leftx = 0;
        int righty = 3;
        int rightx = 2;

        for (int i=0;i<numbers.length;i++) {
            int y = 0;
            int x = 0;
            for (int n=0;n<4;n++) {
                for (int m=0;m<3;m++) {
                    if (map[n][m] == numbers[i]) {
                        y = n;
                        x = m;
                        break;
                    }
                }
            }

            //키패드 1, 4, 7
            if (x == 0) {
                lefty = y;
                leftx = x;
                answer += "L";
            } 
            //키패드 3, 6, 9
            else if (x == 2) {
                righty = y;
                rightx = x;
                answer += "R";
            }
            //키패드 2, 5, 8, 0
            else if (x == 1) {
                int leftyAbs = (int)Math.abs(lefty - y);
                int leftxAbs = (int)Math.abs(leftx - x);
                int rightyAbs = (int)Math.abs(righty - y);
                int rightxAbs = (int)Math.abs(rightx - x);

                int leftLoc = leftyAbs + leftxAbs;
                int rightLoc = rightyAbs + rightxAbs;
                
                if (leftLoc < rightLoc) {
                    lefty = y;
                    leftx = x;
                    answer += "L";
                } else if (leftLoc > rightLoc) {
                    righty = y;
                    rightx = x;
                    answer += "R";
                }
                //같을 경우 왼손잡이인지, 오른손잡이인지 확인
                else {
                    if (hand.equals("left")) {
                        lefty = y;
                        leftx = x;
                        answer += "L";
                    } else {
                        righty = y;
                        rightx = x;
                        answer += "R";
                    }
                }           
            }
        }

        return answer;
    }
}
