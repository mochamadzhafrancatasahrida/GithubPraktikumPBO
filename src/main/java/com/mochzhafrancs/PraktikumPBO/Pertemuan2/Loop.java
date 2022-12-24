package com.mochzhafrancs.PraktikumPBO.Pertemuan2;

public class Loop {

    public static void main(String[] args) {
        // ----FOR------
        for (int i = 0; i < 5; i++) {
            System.out.println("Looping For....(" + i + "/5)");
        }
        System.out.println("For loop selesai! \n");

        // ------While-------
        int j = 0;
        while (j < 5) {
            System.out.println("Looping While....(" + j + "/5)");
            j++;
        }
        System.out.println("While loop selesai! \n");

        // -----DO WHILE-----
        int k = 0;
        do {
            System.out.println("Looping Do-While....(" + k + "/5");
            k++;
        } while (k < 5);
        System.out.println("Do While Looping telah selesai! \n");

        //----BREAK-----
        int a = 1;
        while (a <= 100) {
            System.out.println("Loading... (" + a + "%)");
            a += 10;

            if (a == 50) {
                System.out.println("Udah ah, capek!");
                break;
            }
        }
        System.out.println("Looping While selesai! \n");

    }
}
