package com.hilda.Modul2.Polimorfisme;

public class DemoOverriding {
    public static void main(String[] args) {
        X supperClass = new X();
        Y subClass = new Y();

        supperClass.getValue("Mati Listrik");
        subClass.getValue("mati Lampu");
    }
}
