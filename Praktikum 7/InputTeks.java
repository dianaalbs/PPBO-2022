// Nama : Diana Adilla Lubis
// NIM 	: M0521018

package com.java.textcli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputTeks {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanTeks(String teks) {
		// set up file and stream
		// ganti path "/tmp/sample3.data" dengan alamat file di komputer anda
		File outFile = new File("/tmp/sample3.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			PrintWriter outStream = new PrintWriter(outFileStream);
			outStream.print(teks);
			outStream.close();
			System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		InputTeks it = new InputTeks();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}


/*  Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.
    
    Jawab:
    Jika file tersebut dijalankan, maka hasil yang terdapat pada file "sample3.data" akan sesuai dengan kalimat yang diinputkan. 

    Hal tersebut terjadi karena terdapat fungsi "PrintWriter.write()" pada source code yang berfungsi untuk menulis dan menyimpan 
	data string dalam format ASCII.
 */
