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

        String[] hours = {
            "one", "two", "three", "four", "five", "six", "seven", "eight",
            "nine", "ten", "eleven", "twelve"
        };

        String[] minutes = {
            "one", "two", "three", "four", "five", "six", "seven", "eight",
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

        //mid
        String mid = "";
        if (m == 00) {
            mid = mids[2];
        }

        //minute

        //quater

        //1 ~ 30분까지


        //31 ~ 59분까지


        return answer;
    }

}