package Pertemuan5;

public class Mahasiswa {
    String nim;
    String nama;

    // Method constructor default
    public Mahasiswa () {
        
    }

    // Constructor berparameter
    public Mahasiswa (String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
    }

    public String getNim(){
        return nim;
    }

    public String getNama () {
        return nama;
    }
}