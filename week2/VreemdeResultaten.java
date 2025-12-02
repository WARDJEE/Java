package week2;

public class VreemdeResultaten {
    public static void main(String[] args){
        /* 1. Hij gaat 42 printen want er staan geen haakjes rond de som
            int a = 4;
            int b = 2;
            System.out.println("De som is: " + a + b); */

        /* 2. Getal is te groot, moet een Long zijn. Gaat nu iets negatief terug geven
            int a = 46400;
            int b = a * a;
            System.out.println("b = " + b); */

        /* 3. Door te delen door 1000 gaat hij de int afronden waardoor de vermenigvuldiging niet klopt
            int a = 32700;
            int b = (a / 1000) * 500;
            int c = (a * 500) / 1000;
            System.out.println("b = " + b);
            System.out.println("c = " + c); */

        /* 4. Je mag geen == of != gebruiken bij floats of doubles omdat het nooit exact dat kommagetal is
            double d = 0;
            while(d != 0.3) {
                d += 0.1;
                System.out.println(d);
            } */

        /* 5. Zelfde als 4
            double d = 0.1 + 0.2;
            if (d == 0.3) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            } */

        /* 6. Float kan maar 6 getallen hebben waardoor niet meer exacte waarde
            float f = 1000000F;
            int i = 0;
            while(i<100000000) {
                f += 0.04F;
                i++;
            }
            System.out.println("f = " + f); */

        /* 7. Double te groot waardoor niet meer exacte waarde
            double d = 1234567890123456.0;
            int i = 0;
            while(i<100) {
                d += 0.2;
                ++i;
            }
            System.out.println("d = " + d); */

        /* 8. Correct
            double a = 2927.6 + 67 + 63 + 63 + 70 - 3142.5;
            System.out.println("a = " + a); */
    }
}
