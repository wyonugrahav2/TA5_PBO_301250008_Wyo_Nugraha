package Pertemuan5;

public class KotakDenganMethod {
    int panjang;
    int lebar;
    int tinggi;
    int volume;

    // Pembuatan method hitung dengan jenis non void atau mengembalikan nilai
    public int hitungVolume () {
        volume = panjang * lebar * tinggi;
        return volume;
    }

    public void setData (int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public static void main (String[] args) {
        KotakDenganMethod obj = new KotakDenganMethod();
        obj.setData(10, 20, 5); // Melewatkan data (pass by value)
        System.out.println("Volume Kotak: " + obj.hitungVolume());
    }
}