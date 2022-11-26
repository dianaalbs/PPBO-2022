//Nama : Diana Adilla Lubis
//NIM  : M0521018

package com.java.p8a;

import com.java.p8.Buku;

public class BukuInherit extends Buku {
    public BukuInherit(String isbn, String judul, String penulis, String penerbit, int tahunTerbit) {

        super(isbn, judul, penulis, penerbit, tahunTerbit);
        super.isbn = isbn;
        super.judul = judul;
        super.penulis = penulis;
        super.penerbit = penerbit;
        super.tahunTerbit = tahunTerbit;
    }
}

/*
Adakah error yang ditemui pada BukuInherit yang berkaitan dengan access modifier? 
Jelaskan penyebab errornya!

Jawab:
Ada, yaitu terdapat pada variabel "isbn", "penulis". dan "tahunTerbit".

- variabel "isbn" pada class Buku menggunakan class modifier bertipe private
  sehingga variable tersebut hanya dapat di akses di dalam class Buku saja.
  
- variabel "penulis" dan "tahunTerbit" menggunakan access modifier bertipe default
  sehingga hanya dapat di akses di dalam package yang sama.

*/