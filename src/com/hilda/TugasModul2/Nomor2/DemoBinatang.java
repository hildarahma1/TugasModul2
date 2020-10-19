package com.hilda.TugasModul2.Nomor2;

public class DemoBinatang {
    public static void main(String[] args) {
        // Objek Burung
        Burung burung = new Burung();
        burung.nama = "Burung Elang";
        burung.makan = "Ular";
        burung.tidur = "Burung Elang tidur pada malam hari";
        burung.terbang = "Burung Elang Terbang Menggunakan Sayapnya yang gagah";

        // Memanggil Method Burung
        System.out.println("\t\t\t---------- BURUNG ----------");
        burung.getNama();
        burung.binatang();
        burung.terbang();

        System.out.println();

        // Objek Ikan
        Ikan ikan = new Ikan();
        ikan.nama = "Ikan Paus";
        ikan.makan = "Ikan Paus Makan Ikan yang lebih kecil";
        ikan.tidur = "Ikan Paus Tidur Pada Malam Hari";
        ikan.berenang = "Ikan Paus Berenang Menggunakan Sirip";

        System.out.println();

        // Memanggil Method IKAN
        System.out.println("\t\t\t---------- IKAN ----------");
        ikan.getNama();
        ikan.binatang();
        ikan.berenang();

        System.out.println();

        // Objek Kucing
        Kucing kucing = new Kucing();
        kucing.nama = "Kucing Anggora";
        kucing.makan = "Kucing Anggora Makan Royal Canin";
        kucing.tidur = "Kucing Anggora Pada Malam Hari";
        kucing.meong = "Kucing Anggora Mengeong Saat Lapar";

        // Memanggil Method Kucing
        System.out.println("\t\t\t---------- KUCING ----------");
        kucing.getNama();
        kucing.binatang();
        kucing.meong();
    }
}
