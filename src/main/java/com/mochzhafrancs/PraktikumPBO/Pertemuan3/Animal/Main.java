package com.mochzhafrancs.PraktikumPBO.Pertemuan3.Animal;

public class Main {

    public static void main(String[] args) {
        // Pembuatan Class
        Animal cat = new Animal("Johny", 3, "Black");
        Animal dog = new Animal("Mira", 4, "Red");
        Animal rabbit = new Animal("Mura", 1, "White");

        /*  Animal cat = new Animal();
            Animal dog = new Animal();
             Animal rabbit = new Animal();
            // Mengisi nilai attribute object 'cat'
           cat.name = "Johny";
            cat.age = 3;
            cat.color = "Black";
            
            //Mengisi nilai attribute object 'dog'
            dog.name = "Mira";
            dog.age = 4;
            dog.color = "Red";
            
            //Mengisi nilai attribute object 'rabbit'
            rabbit.name = "Mura";
            rabbit.age = 1;
            rabbit.color = "White"; */
        //Menjalankan method 'showProfile()' masing masing object
        cat.showProfile();
        dog.showProfile();
        rabbit.showProfile();

        // Demo Getter & Setter
        System.out.println("Dog's name (before) : " + dog.getName());
        dog.setName("Blackky");
        System.out.println("Dog's name (after) : " + dog.getName());
    }
}
