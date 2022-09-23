// Nama : Diana Adilla Lubis
// NIM  : M0521018

import java.util.Scanner;

public class PPBO_03_Latihan1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Total pembelian : ");
      
        // tambahkan code untuk menyimpan nominal total pembelian
        int totalPembelian = sc.nextInt();
        double diskon;


        // tambahkan code untuk mengimplementasikan ketentuan diskon yang ditetapkan
        if (totalPembelian < 50000) {
            diskon = totalPembelian - (0.0*totalPembelian);
          }
          else if ((totalPembelian >= 50000) && (totalPembelian < 75000)) {
            diskon = totalPembelian - (0.05*totalPembelian);
          }
          else if ((totalPembelian >= 75000 ) && (totalPembelian < 125000)) {
            diskon = totalPembelian - (0.15*totalPembelian);
          } 
          else if (totalPembelian >= 125000) {
            diskon = totalPembelian - (0.2*totalPembelian);
          } 
          else {
            diskon = totalPembelian;
          }
        

        // tambahkan code untuk menampilkan nominal yang harus dibayar 
        // sesuai dengan ketentuan diskon yang diberikan
        System.out.println("Total yang harus dibayar: Rp."+ diskon);
        

        sc.close();
    }
}

// Seorang mahasiswa berbelanja di mini market. Mini market tersebut memberikan diskon kepada
// pembeli dengan ketentuan
// a. Diskon 0% jika total pembelian di bawah 50.000
// b. Diskon 5% jika total pembelian 50.000 hingga 75.000
// c. Diskon 15% jika total pembelian di atas 75.000 hingga 125.000
// d. Diskon 20% jika total pembelian di atas 125.000