package com.mochzhafrancs.PraktikumPBO.Pertemuan3.Tugas.Zhafran;

public class Main {
    public static void main(String[] args) {
        // memanggil class Aldi
        Zhafran saya = new Zhafran ("Agum", 168, 64, 20);
        Zhafran dia = new Zhafran ("Yoga", 166, 60, 19);
        
        // menjalankan Method
        saya.tentangSaya();
        dia.tentangSaya();
        
        // Menjalankan Getter & Setter dari class Aldi
        System.out.println("Tinggi badan saya(sebelum diet) : " + dia.getBerat());
        dia.setBerat(75);
        System.out.println("Tinggi badan saya (setelah diet) : " + dia.getBerat());
        
        System.out.println("\n");
        // menghitung massa tubuh
        double massa = dia.getBerat() / ((dia.getTinggi() * 0.01) * (dia.getTinggi() * 0.01));
        
        System.out.println("Massa Tubuh saya adalah " + massa);
        
        System.out.println("\n");
        
        //Inheritance = menghubungkan dua objek atau lebih
        Test hewan = new Test(); // memanggil class Test
        System.out.println("Apakah hewan adalah Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah hewan adalah Hewan -> " + (hewan instanceof Test));
        System.out.println("Apakah hewan adalah Hiu -> " + (hewan instanceof Hiu));
        System.out.println("------------------------"); // spasi
 
        Hiu hiu = new Hiu(); // Memanggil class Kucing “Hiu Bernafas dengan 5 liang insang” 
        System.out.println("Apakah hewan adalah Objek -> " + (hiu instanceof Object));
        System.out.println("Apakah hiu adalah Hewan -> " + (hiu instanceof Test));
        System.out.println("Apakah hiu adalah Hiu -> " + (hiu instanceof Hiu)); 
    }
}