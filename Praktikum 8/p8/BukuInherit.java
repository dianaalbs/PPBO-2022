//Nama : Diana Adilla Lubis
//NIM  : M0521018

package com.java.p8;

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
Ada, yaitu terdapat pada variabel "penulis", hal ini terjadi karena pada class Buku 
menggunakan access modifier bertipe private sehingga hanya dapat diakses di dalam
class Buku tersebut.
*/