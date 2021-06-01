public class hackerrank24 {
    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        long answer = s.length();

        if (s.length() == 1) {
            return answer;
        }
        else if (s.length() == 2) {
            if (s.charAt(0) == s.charAt(1)) {
                answer++;
                return answer;
            }
        }

        for (int i=2;i<s.length();i++) {
            int idx = 0;

            while (true) {
                String temp = s.substring(idx, idx+i);

                int index = 0;
                String first = "";
                String second = "";
                StringBuffer sb;
                String reversedString = "";

                if (i % 2 == 0) {
                    index = i / 2;
                    first = temp.substring(idx, index);

                    sb = new StringBuffer(first);
                    reversedString = sb.reverse().toString();
                    second = temp.substring(index, idx+i);

                } else {
                    index = (i / 2) + 1;
                    first = temp.substring(idx, index);

                    sb = new StringBuffer(first);
                    reversedString = sb.reverse().toString();
                    second = temp.substring(index - 1, idx+i);
                    
                }

                System.out.println(first + " " + reversedString + " " + second);

                if (reversedString.equals(second)) {
                    answer++;
                }
                idx++;
                if ((idx + i) > s.length()) {
                    break;
                }
            }
        }

        return answer;
    }
}
