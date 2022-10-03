// Nama : Diana Adilla Lubis
// NIM  : M0521018

import java.util.InputMismatchException;
import java.util.Scanner;

public class PPBO_04_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2;
        boolean lanjut = true;
        while (lanjut) {
            try {
                System.out.print("Ketik bilangan pertama : ");
                bil1 = sc.nextInt();
                System.out.print("Ketik bilangan kedua : ");
                bil2 = sc.nextInt();
                double hasil = Double.valueOf(bil1) / Double.valueOf(bil2);

                System.out.println(bil1 + " / " + bil2 + " = " + hasil);
                lanjut = false;
            } catch (InputMismatchException e) {
                sc.next();
                System.out.println("Input salah, masukkan angka");
            }
        }

        sc.close();
    }
}

// Ketik huruf untuk digunakan sebagai input bilangan pertama kemudian klik ENTER. 
// Jelaskan perbedaannya dengan source code sebelumnya (Latihan1)!
/* Jawab: 

   Pada sorce code ini, jika menginput bilangan pertama dengan huruf maka program akan 
   mencetak "Input salah, masukkan angka" dan tidak akan berhenti ataupun menghasilkan
   InputMismatchExeption error. Perbedaan dari source sebelunya ialah parogram Latihan2 ini 
   menggunakan statment catch yang berfungsi untuk menangani sebuah error pada program sehingga 
   tidak terjadi InputMismatchExeption error.

*/ 
