package Pertemuan5;

public class DemoMahasiswa {
    public static void main(String[] args) {
        // Instansi dengan menggunakan konstruktor yang memiliki parameter
        Mahasiswa mhs = new Mahasiswa("08116987", "Defandra Fathi");

        System.out.println("Nim  : " + mhs.getNim());
        System.out.println("Nama : " + mhs.getNama());
    }
}