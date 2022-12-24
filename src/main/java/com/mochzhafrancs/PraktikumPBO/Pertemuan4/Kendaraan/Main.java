package com.mochzhafrancs.PraktikumPBO.Pertemuan4.Kendaraan;

public class Main {

    public static void main(String[] args) {
        // Class object
        Mobil mb = new Mobil();
//        Bis bs = new Bis();
        Kendaraan kn = new Kendaraan();

        // Memasukkan nilai attribute
        mb.nama = "Suzuki";
        mb.jmlRoda = 4;
        mb.maxGear = 8;

        kn.nama = "Kendaraan James Moriarty";
        kn.jmlRoda = 4;

//        bs.nama = "Budiman";
//        bs.jmlRoda = 6;
//        bs.dayaAngkut = 20;
        // Uji coba pemanggilan method
        mb.showInfo();
        mb.nyalakanMesin();
        mb.belok("Kanan");
        mb.belok();

        System.out.println();
        kn.showInfo();
        kn.nyalakanMesin();

//        System.out.println();
//        bs.showInfo();
//        bs.nyalakanMesin();
//        bs.belok("Kiri");
//        bs.belok();
    }
}
