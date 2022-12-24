package com.mochzhafrancs.PraktikumPBO.Pertemuan3.Challenge;

public class Challenge {

    //Attribute
    private String name;
    private int visitorsToday;
    private int yearBuilt;

    // Constructor
    public Challenge() {
    }

    public Challenge(String name, int visitorsToday, int yearBuilt) {
        this.name = name;
        this.visitorsToday = visitorsToday;
        this.yearBuilt = yearBuilt;
    }

    //Method mencetak semua attribute
    public void showProfile() {
        System.out.println("Name : " + name);
        System.out.println("Visitors Today : " + visitorsToday);
        System.out.println("year Built : " + yearBuilt);
        System.out.println();
    }

    // Alt + Fn + insert ---> Getter and Setter ---> Select all
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVisitorsToday() {
        return visitorsToday;
    }

    public void setVisitorsToday(int visitorsToday) {
        this.visitorsToday = visitorsToday;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }
}
