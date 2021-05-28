import java.math.BigInteger;

//Extra Long Factorials
class hackerrank01 {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */
    
    
    public static void extraLongFactorials(int n) {
    // Write your code here
        BigInteger answer = BigInteger.valueOf(1);

        while (true) {
            answer = answer.multiply(BigInteger.valueOf(n));
            n--;
            if (n == 0) {
                break;
            }
        }
        System.out.println(answer);
    } 
}