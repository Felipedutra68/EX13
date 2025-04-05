package EX13;

import java.util.Arrays;

/**
 *
 * @author ADM
 */
public class EX9_Subtracao {

    public static void main(String[] args) {

        int n1 = 0;

        int[][] m1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] m2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] m3 = {{7, 8, 1}, {9, 5, 7}};
        

        int[][] set1 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int c = 0; c < 3; c++) {

                set1[i][c] = m1[i][c] / m2[i][c] / m3[i][c];

            }
        }

        System.out.println(Arrays.deepToString(set1));

    }

}
