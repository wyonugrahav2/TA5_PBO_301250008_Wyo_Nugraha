package Pertemuan5;

class Manusia {
    String nama;
    String jenkel;

    public Manusia() {}

    void setNilai (String param1) {
        nama = param1;
    }

    void setNilai (String param1, String param2) {
        nama = param1;
        jenkel = param2;
    }

    void cetak () {
        System.out.println(nama + " adalah " + jenkel);
    }
}

class MethodOverloading {
    public static void main(String[] args) {
        Manusia m1, m2;
        m1 = new Manusia();
        m2 = new Manusia();

        m1.setNilai("Zamzam");
        m2.setNilai("Zamzam", "Laki-laki");

        m1.cetak();
        m2.cetak();
    }
}