package com.mochzhafrancs.PraktikumPBO.Pertemuan3.Challenge;

public class Main {

    public static void main(String[] args) {
        Challenge aldi = new Challenge("Aldi", 4, 2004);
        Challenge yoga = new Challenge("Yoga", 5, 2005);
        Challenge setiawan = new Challenge("Setiawan", 6, 2006);

        aldi.showProfile();
        yoga.showProfile();
        setiawan.showProfile();

        System.out.println("Aldi name (before) : " + aldi.getName());
        aldi.setName("Asshole");
        System.out.println("Aldi name (after) : " + aldi.getName());

    }
}
