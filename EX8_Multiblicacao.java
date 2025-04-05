package EX13;

import java.util.Arrays;

/**
 *
 * @author ADM
 */
public class EX8_Multiblicacao {

    public static void main(String[] args) {

        int n1 = 0;

        int[][] m1 = {{1, 2}, {4, 5}};
        int[][] m2 = {{7, 8}, {10, 11}};

        int[][] set1 = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int c = 0; c < 2; c++) {

                set1[i][c] = m1[i][c] * m2[i][c];

            }
        }

        System.out.println(Arrays.deepToString(set1));

    }

}
