//Encryption
public class hackerrank02 {

    /*
    * Complete the 'encryption' function below.
    *
    * The function is expected to return a STRING.
    * The function accepts STRING s as parameter.
    */

    static int getPower(int n) {
        return n * n;
    }

    public static String encryption(String s) {
    // Write your code here
        
        String answer = "";

        //len
        int len = s.length();
        int row = 0;
        int column = 1;
        while (true) {
            row++;
            column++;
            int a = getPower(row);
            int b = getPower(column);
            if (a <= len && len <= b) {
                break;
            }
        }
        if (row * column < len) {
            row++;       
        }

        //array
        char[][] temp = new char[row][column];
        int idx = 0;
        for (int i=0;i<row;i++) {
            for (int j=0;j<column;j++) {
                if (idx >= len) {
                    continue;
                } else {
                    temp[i][j] = s.charAt(idx);
                    idx++;
                }
            }
        }
        
        for (int i=0;i<row;i++) {
            for (int j=0;j<column;j++) {
                System.out.print(temp[i][j] + " ");
            }
            System.out.println();
        }
        
        //output
        for (int j=0;j<column;j++) {
            for (int i=0;i<row;i++) {
                answer += temp[i][j];
            }
            answer += " ";
        }

        return answer;
    }
}
