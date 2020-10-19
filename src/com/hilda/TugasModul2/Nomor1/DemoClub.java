package com.hilda.TugasModul2.Nomor1;

public class DemoClub {
    public static void main(String[] args) {


        Club club1 = new Club();
        Club club2 = new Club("Liverpool");
        Club club3 = new Club("Liverpool", " Liverpool Football Club atau The Reds adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool");
        Club club4 = new Club("Liverpool", 1892, "Anfield");
        Club club5 = new Club("Liverpool", 1892, "Anfield", 6, "Liverpool Football Club atau The Reds adalah sebuah klub sepak bola asal Inggris yang berbasis di Kota Liverpool");
        //pemangggilan method
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club4.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
