package week07;

import java.util.Scanner;

public class DriehoekVanPascal {
    static void main() {
        Scanner scan = new Scanner(System.in);


        System.out.print("Geef het aantal rijen (max 12): ");
        int rijen = scan.nextInt();

        if(rijen > 12){
            rijen = 12;
        }

        if(rijen < 0){
            rijen = 1;
        }

        int[][] matrix = new int[rijen][rijen];

        for (int i = 0; i < rijen; i++) {
            matrix[i][i] = 1;
            matrix[i][0] = 1;
            for (int j = 0; j <= i; j++) {
                matrix[i][j] = (j == 0)? 1:matrix[i-1][j] + matrix[i-1][j-1];
            }
        }

        for (int i = 0; i < rijen; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
