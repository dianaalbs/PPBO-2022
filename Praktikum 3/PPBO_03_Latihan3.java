// Nama : Diana Adilla Lubis
// NIM  : M0521018

public class PPBO_03_Latihan3 {
    public static void main(String[] args) {
        int arr[] = {5, 1, 4, 2, 3};
        //for (int i = 1; i < 6; i++) {
        
        //perbaikan
        for (int i = 0; i < 5; i++) { 
            System.out.println("elemen ke-" + i + " = " + arr[i]);
        }
    }
}

// Berikut ini adalah code untuk menampilkan elemen (anggota) sebuah array yang berupa bilangan
// integer, mulai dari elemen pertama hingga terakhir.

// Eksekusi source code tersebut dan jelaskan apakah penulisan kode perulangan dengan for pada code
// tersebut sudah tepat dan tuliskan perbaikan apabila diperlukan!

// Jawab:  
/* Penulisan for pada kode perulangan tersebut masih kurang tepat dan jika dijalankan akan 
   menimbulkan error karena index pada array selalu dimulai dari 0. Kemudian, program tersebut 
   hanya memiliki index sebanyak 4 yg artinya jika memanggil index ke-5 maka hasil tidak akan muncul.

   Oleh karena itu, untuk memperbaiki kode maka variable i dimulai dari 0 sampai dengan i < 5.

 */