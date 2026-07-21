package Pertemuan5;

public class DemoKotak {
    public static void main (String[] args) {
        double volume;
        // Membuat objek dengan nama k
        Kotak k = new Kotak();

        // Mengisikan nilai ke dalam data-data kelas
        k.panjang = 4;
        k.lebar = 3;
        k.tinggi = 2;

        // Menghitung isi/volume kotak
        volume = k.panjang * k.tinggi * k.lebar;
        
        // Menampilkan nilai volume ke layar console
        System.out.println("Volume Kotak = " + volume);
    }
}