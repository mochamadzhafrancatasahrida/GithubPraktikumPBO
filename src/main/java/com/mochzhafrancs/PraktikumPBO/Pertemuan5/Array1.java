package com.mochzhafrancs.PraktikumPBO.Pertemuan5;

public class Array1 {

    public static void main(String[] args) {
        // Pembuatan array
        String[] names = new String[3];

        // Cek Panjang Array
        System.out.println("Panjang Array : " + names.length);

        // Memasukkan nilai ke array
        names[0] = "Panji";
        names[1] = "Paijo";
        names[2] = "Parto";

        // Menampilkan semua nilai array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Nama " + i + " : " + names[i]);
        }
    }
}
