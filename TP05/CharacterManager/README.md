
# Character Manager - Sprint #2

## 1. Deskripsi Proyek

Character Manager adalah program berbasis Java yang digunakan untuk mengelola data karakter. Proyek ini dibuat untuk memenuhi tugas praktikum Character Manager Sprint #2.

Program ini menerapkan konsep Object-Oriented Programming (OOP), seperti class, object, encapsulation, method overriding, reference object, static variable, dan penggunaan ArrayList.

## 2. Tujuan Proyek

Tujuan pembuatan proyek ini adalah:
- Memahami penggunaan class dan object dalam Java.
- Mengelola data karakter menggunakan ArrayList.
- Menerapkan method equals() untuk membandingkan nama karakter.
- Mencegah penambahan karakter dengan nama duplikat.
- Memahami konsep enkapsulasi dan defensive copy.
- Menghitung statistik karakter berdasarkan level dan tipe.

## 3. Fitur Program

### A. Pengelolaan Karakter
- Menambahkan karakter baru.
- Mencari karakter berdasarkan nama.
- Menghapus karakter berdasarkan nama.
- Menghitung jumlah karakter.
- Menampilkan seluruh karakter.
- Menolak nama karakter yang duplikat.

### B. Analisis Karakter
- Menghitung rata-rata level menggunakan getAverageLevel().
- Mencari karakter berdasarkan tipe menggunakan findByType().
- Menghitung jumlah karakter berdasarkan tipe menggunakan countByType().
- Mengembalikan nilai 0 jika rata-rata dihitung pada daftar kosong.

### C. Defensive Copy
Method getAllCharacters() mengembalikan salinan daftar karakter menggunakan ArrayList baru. Dengan cara ini, perubahan pada daftar hasil salinan tidak mengubah daftar internal CharacterManager.

### D. Object Reference
Program menguji dua variabel yang menunjuk objek Character yang sama. Jika level objek diubah melalui salah satu variabel, perubahan tersebut dapat dilihat melalui variabel lainnya.

### E. Static Counter
Variabel totalCharacterCreated menggunakan keyword static untuk menghitung jumlah objek Character yang dibuat selama program berjalan.

## 4. Tipe Karakter

Program menggunakan enum CharacterType yang terdiri dari:
- WARRIOR
- MAGE
- ARCHER
- HEALER

Setiap karakter mempunyai nama, level, dan tipe karakter.

## 5. Struktur Folder

```text
CharacterManager/
└── src/
    └── com/
        └── unpri/
            └── charactermanager/
                └── model/
                    ├── Character.java
                    ├── CharacterManager.java
                    ├── CharacterType.java
                    └── Main.java
```

## 6.Screenshot 
(<![alt text](<Screenshot 2026-10-16 043425.png>)

## 7. Contoh Pengujian

Program melakukan pengujian terhadap:
1. Penambahan karakter baru.
2. Penolakan nama duplikat, termasuk perbedaan huruf besar dan kecil.
3. Pencarian karakter berdasarkan nama.
4. Penghapusan karakter.
5. Perhitungan rata-rata level.
6. Pencarian karakter berdasarkan tipe.
7. Perhitungan jumlah karakter berdasarkan tipe.
8. Defensive copy untuk melindungi daftar internal.
9. Penggunaan reference object.
10. Penghitungan total objek yang dibuat.

## 8. Fitur Analitik Tambahan

Fitur tambahan yang dibuat adalah countByType(CharacterType type).

Method ini digunakan untuk menghitung jumlah karakter berdasarkan tipe tertentu. Contohnya, pengguna dapat mengetahui jumlah karakter bertipe MAGE tanpa menghitungnya secara manual.

Method ini juga menangani parameter null dengan mengembalikan nilai 0.

## 9. Analisis Teori

Analisis teori proyek membahas:
- Perbedaan variabel primitif dan reference object.
- Perilaku dua variabel yang merujuk objek yang sama.
- Fungsi keyword static.
- Alasan method equals() perlu di-override.
- Risiko mengembalikan ArrayList internal secara langsung.
- Pentingnya enkapsulasi dan defensive copy.

### Link Google Docs
https://docs.google.com/document/d/1IHTC13s3mpiGbU52oTX7Gs4FpFVkYvFcBfjUYw1UGnk/edit?usp=sharing
