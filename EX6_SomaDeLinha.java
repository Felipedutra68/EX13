package EX13;

/**
 *
 * @author ADM
 */
public class EX6_SomaDeLinha {

    public static void main(String[] args) {

        int n1 = 0;

        int n2 = 0;

        int[][] set = new int[5][5];

        for (int i = 1; i < 5; i++) {

            n1 = n1 + i;

        }

        for (int c = 1; c < 5; c++) {

            n2 = n2 + c;

        }

        System.out.println(n1);
        System.out.println(n2);

    }

}
