// Nama : Diana Adilla Lubis
// NIM  : M0521018

import java.util.Scanner;

class PPBO_03_Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter year : ");
        int year = sc.nextInt();
        
        if (year % 400 == 0) {                                  //jika tahun habis dibagi 400 maka tahun tersebut adalah tahun kabisat.
            System.out.print(year + " is a leap year\n");
          } else if (year % 100 == 0) {                         //jika tahun habis dibagi 100 maka tahun tersebut bukan tahun kabisat.
            System.out.print(year + " is not a leap year\n");
          } else if (year % 4 == 0) {                           //jika tahun habis dibagi 4 maka tahun tersebut adalah tahun kabisat.
            System.out.print(year + " is a leap year\n");
          } else {                                              //Jika tahun tidak habis dibagi 400, 100 dan 4 maka tahun tersebut bukan tahun kabisat.
            System.out.print(year + " is not a leap year\n");
          }

        sc.close();
    }
}

// Buatlah conditional statement untuk melakukan pengecekan terhadap input variabel 'year'
// Cek apakah input merupakan tahun kabisat
// Jika tahun kabisat, berikat output '... is a leap year'
// Jika bukan tahun kabisat, berikan output '... is not a leap year'
// ... di atas maksudnya adalah nilai variabel 'year' yang diinputkan

// Contoh 
// input : 2020
// output : 2020 is a leap year

// Contoh
// input : 2031
// output : 2031 is not a leap year