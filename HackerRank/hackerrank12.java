import java.util.List;

public class hackerrank12 {
    /*
     * Complete the 'checkMagazine' function below.
     *
     * The function accepts following parameters:
     *  1. STRING_ARRAY magazine
     *  2. STRING_ARRAY note
     */

    public static void checkMagazine(List<String> magazine, List<String> note) {
    // Write your code here
        int idx = 0;
        while(true) {
            int check = 0;
            for (int i=0;i<magazine.size();i++) {
                if (note.get(idx).equals(magazine.get(j))) {
                    check = 1;
                    note.remove(idx);
                    magazine.remove(j);
                    break;
                }
            }
            if (check == 0) {
                System.out.println("No");
                return;
            }
            if (note.size() == 0) {
                System.out.println("Yes");
                return;
            }
        }
    }
}
