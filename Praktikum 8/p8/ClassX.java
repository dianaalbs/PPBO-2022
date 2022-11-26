//Nama : Diana Adilla Lubis
//NIM  : M0521018

package com.java.p8;

public class ClassX {
    public static void main(String[] args) {
    // buat objek buku
    Buku buku = new Buku("432A326B4", "Pengenalan Komputasi Cloud", "Eri Suhardi", "Elex Media Komputindo", 2022);

    // tampilkan data buku lewat method printDataBuku
    buku.printDataBuku();

    // akses ke variabel yang ada di objek buku
    System.out.println(buku.isbn);
    System.out.println(buku.judul);
    System.out.println(buku.penulis);
    System.out.println(buku.penerbit);
    System.out.println(buku.tahunTerbit);
    }
}

/* 
Adakah error yang ditemui pada ClassX yang berkaitan dengan access modifier? 
Jelaskan penyebab errornya!

Jawab:
Ada, yaitu terdapat pada variabel "penulis", hal ini terjadi karena pada class Buku 
menggunakan access modifier bertipe private sehingga hanya dapat diakses di dalam
class Buku tersebut.
*/