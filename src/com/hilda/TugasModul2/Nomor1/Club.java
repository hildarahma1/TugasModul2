package com.hilda.TugasModul2.Nomor1;

public class Club {
    String Nama;
    int TahunBerdiri;
    String Stadion;
    int JuaraUcl;
    String Deskripsi;


    public Club() {
    }
    public Club(String Nama) {
        this.Nama = Nama;
    }

    public Club(String Nama, String Deskripsi) {
        this.Nama = Nama;
        this.Deskripsi = Deskripsi;
    }
    public Club(String Nama, int TahunBerdiri, String Stadion) {
        this.Nama = Nama;
        this.TahunBerdiri = TahunBerdiri;
        this.Stadion = Stadion;
    }
    public Club(String Nama, int TahunBerdiri, String Stadion, int JuaraUcl, String Deskripsi) {
        this.Nama = Nama;
        this.TahunBerdiri = TahunBerdiri;
        this.Stadion = Stadion;
        this.JuaraUcl = JuaraUcl;
        this.Deskripsi = Deskripsi;
    }
    public void getTeam(){
        System.out.println("Nama Club\t\t: " + Nama);
        System.out.println("Tahun Berdiri\t: " + TahunBerdiri);
        System.out.println("Nama Stadion\t: " + Stadion);
        System.out.println("Juara UCL\t\t: " + JuaraUcl);
        System.out.println("Deskripsi Club\t: " + Deskripsi);
    }
}
