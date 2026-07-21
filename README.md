# Tugas Pertemuan 5 — Object Oriented Programming Dasar

**NIM/Nama:** 301250008 - Wyo Nugraha
**Project:** TugasPertemuan5 (Maven)

## Deskripsi
Latihan konsep dasar Object Oriented Programming (OOP) di Java: pembuatan
class & object, method, constructor (default & berparameter), dan method
overloading.

## Struktur Project
```
TugasPertemuan5/
├── pom.xml
└── src/main/java/
    ├── Pertemuan5/
    │   ├── Kotak.java
    │   ├── DemoKotak.java
    │   ├── KotakDenganMethod.java
    │   ├── Mahasiswa.java
    │   ├── DemoMahasiswa.java
    │   └── Manusia.java            (berisi 2 class: Manusia & MethodOverloading)
    └── com/mycompany/tugaspertemuan5/
        └── TugasPertemuan5.java     (main class default NetBeans/Maven)
```

## Daftar Kelas

| Kelas | Materi | Ringkasan |
|---|---|---|
| `Kotak.java` | Class & Atribut | Class sederhana dengan 3 atribut (`panjang`, `lebar`, `tinggi`) tanpa method. |
| `DemoKotak.java` | Object | Membuat objek `Kotak`, mengisi atributnya secara langsung, lalu menghitung volume di luar class. |
| `KotakDenganMethod.java` | Method | Versi `Kotak` yang dilengkapi method `setData()` (mengisi atribut) dan `hitungVolume()` (mengembalikan nilai volume). |
| `Mahasiswa.java` | Constructor | Class dengan constructor default dan constructor berparameter (`nim`, `nama`), dilengkapi method getter `getNim()` dan `getNama()`. |
| `DemoMahasiswa.java` | Constructor | Membuat objek `Mahasiswa` menggunakan constructor berparameter, lalu mencetak data melalui getter. |
| `Manusia.java` | Method Overloading | Berisi class `Manusia` dengan dua method `setNilai()` yang di-overload (beda jumlah parameter), serta class `MethodOverloading` (main) yang mendemonstrasikan pemanggilan kedua versi method tersebut. |
| `com/mycompany/tugaspertemuan5/TugasPertemuan5.java` | Boilerplate | Main class default bawaan template Maven/NetBeans (`Hello World!`), tidak terkait langsung dengan materi pertemuan 5. |

## Cara Menjalankan
```bash
cd TugasPertemuan5
mvn compile
mvn exec:java -Dexec.mainClass="Pertemuan5.DemoMahasiswa"
```

Beberapa main class lain yang bisa dijalankan dengan cara yang sama:
- `Pertemuan5.DemoKotak`
- `Pertemuan5.KotakDenganMethod`
- `Pertemuan5.MethodOverloading`
- `com.mycompany.tugaspertemuan5.TugasPertemuan5`

## Requirement
- Java 8+ (JDK)
- Maven 3.x
