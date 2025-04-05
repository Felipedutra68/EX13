package EX13;

/**
 *
 * @author ADM
 */
public class EX1_SomaDeMatrizes {

    public static void main(String[] args) {

        int n1 = 0;

         int[][] set = new int[4][4];
           

        for (int i = 1; i < 4; i++) {
            for (int c = 1; c < 4; c++) {

                set[i][c] = i + c;

                n1 += set[i][c];
            }
        }

        System.out.println(n1);

    }

}
