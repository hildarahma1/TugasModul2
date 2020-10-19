package com.hilda.Modul2.Polimorfisme;

public class DemoOverloading {
    public static void main(String[] args) {
        Lagu lagu1 = new Lagu ("Halu");
        Lagu lagu2 = new Lagu("For Him", "Troye Sivan");

        lagu1.getDatalagu();
        lagu2.getDatalagu();
    }
}
