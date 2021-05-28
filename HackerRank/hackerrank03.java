//The Time in Words
class hackerrank03 {

    /*
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here
        String answer = "";

        String[] minutes = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
            "sixteen", "seventeen", "eighteen", "nineteen", "twenty", 
            "twenty one", "twenty two", "twenty three", "twenty four", 
            "twenty five", "twenty six", "twenty seven", "twenty eight",
            "twenty nine" 
        };

        String[] mids = {
            "past",
            "to", 
            "o' clock"
        };

        String[] hours = {
            "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve"
        };

        //mid
        int checkExact = 0;
        String mid = "";
        if (m == 0) {
            mid = mids[2];
            checkExact = 1;
        }
        else {
            if (m >= 1 && m <= 30) {
                mid = mids[0];
            } else {
                mid = mids[1];
            }
        }
        
        //minute
        int checkMinute = 0;
        String minute = "";
        if (m > 30) {
            m = 60 - m;
            checkMinute = 1;
        }

        if (m % 30 == 0) {
            minute = "half";
        } else if (m == 15 || m == 45) {
            minute = "quarter";
        } else {
            for (int i=1;i<=29;i++) {
                if (m == i) {
                    minute = minutes[i];
                    minute += m > 1 ? " minutes" : " minute";
                    break;
                }
            }
        }

        //hour
        String hour = "";
        for (int i=1;i<=hours.length;i++) {
            if (h == i) {
                if (checkMinute == 1) {
                    if (h == 12) {
                        hour = "one";
                    } else {
                        hour = hours[i];
                    }
                } else {
                    hour = hours[i-1];
                }
                break;
            }
        }

        if (checkExact == 1) {
            answer = hour + " " + mid;
        } else {
            answer = minute + " " + mid + " " + hour;
        }

        return answer;
    }

}