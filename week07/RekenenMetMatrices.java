package week07;

public class RekenenMetMatrices {
    static void main() {
        int[][] first = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };
        int[][] second = {
                {4, 5, 6},
                {7, 8, 9},
                {1, 2, 3} };

        int[][] optellen = new int[3 ][3];

        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < second.length; j++) {
                optellen[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Optellen:");
        for (int i = 0; i < optellen.length; i++) {
            for (int j = 0; j < optellen[i].length; j++) {
                System.out.print(optellen[i][j] + " ");
            }
            System.out.println();
        }

        int[][] vermenigvuldigen = new int[3][3];

        for (int m = 0; m < first.length; m++) {
            for (int n = 0; n < second[0].length; n++) {
                int som = 0;
                for (int o = 0; o < first[0].length; o++) {
                    som += first[m][o] * second[o][n];
                }
                vermenigvuldigen[m][n] = som;
            }
        }

        System.out.println();

        System.out.println("Product:");
        for (int[] rij : vermenigvuldigen) {
            for (int getal : rij) {
                System.out.print(getal + " ");
            }
            System.out.println();
        }

    }
}


