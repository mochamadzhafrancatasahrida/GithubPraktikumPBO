package com.mochzhafrancs.PraktikumPBO.Pertemuan2;

import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = input.nextLine();

        System.out.print("Masukkan Usia : ");
        int usia = input.nextInt();

        System.out.print("\n");

        System.out.println("Nama saya : " + nama);
        System.out.println("Usia saya : " + usia + " Tahun");
    }
}
