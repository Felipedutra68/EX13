package EX13;

/**
 *
 * @author ADM
 */
public class EX10_MediaMatriz {
    
public static void main(String[] args) {

        int n1 = 0;

         int[][] set = new int[5][5];
           

        for (int i = 1; i < 5; i++) {
            for (int c = 1; c < 5; c++) {

                set[i][c] = i + c;

                n1 += set[i][c];
            }
        }

        System.out.println(n1/16);

    }
    
    

}
