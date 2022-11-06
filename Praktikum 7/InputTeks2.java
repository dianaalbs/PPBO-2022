// Nama : Diana Adilla Lubis
// NIM 	: M0521018

package com.java.textcli;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class InputTeks2 {
	// method ini untuk input teks oleh user melalui keyboard
	public String ketikTeks() {
		System.out.println("Ketik kalimat yang akan disimpan :");
		Scanner sc = new Scanner(System.in);
		// ambil 1 kalimat, setelah tekan enter teks akan diambil
		String str1 = sc.nextLine();
		return str1;
	}

	// untuk menyimpan teks yang diketik user ke file
	public void simpanString(String teks) {
        // set up file and stream
        // ganti path "/tmp/sample4.data" dengan alamat file di komputer anda
        File outFile = new File(System.getProperty("user.dir") + "\\sample4.data");
        FileOutputStream outFileStream;
		try {
            outFileStream = new FileOutputStream(outFile);
            DataOutputStream outStream = new DataOutputStream(outFileStream);
            outStream.writeBytes(teks);
            outStream.close();
            System.out.println("file berhasil disimpan");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
        catch (IOException i){
            i.printStackTrace();
        }
	}

	public static void main(String[] args) {
		InputTeks2 it = new InputTeks2();
		// memanggil method ketikTeks
		String kalimat = it.ketikTeks();
		// memanggil method simpanTeks
		it.simpanTeks(kalimat);
	}
}


/*  1. Jalankan source code tersebut, buka file teks menggunakan text editor, jelaskan seperti apa hasilnya.
    2. Jelaskan perbedaan cara kerja dari PrintWriter.write() dan DataOutputStream.writeBytes().
    
    Jawab:
    1. Jika file tersebut dijalankan, maka hasil yang ada pada file "sample4.data" akan sesuai dengan kalimat yang diinputkan.  
    
       Hal tersebut terjadi karena terdapat fungsi "DataOutputStream.writeBytes();" pada source code, dengan begitu setiap
       data string akan ditulis ke dalam urutan bytes.
    
    2. PrintWriter berfungsi untuk menulis data dalam karakter sehingga dapat dibaca, sedangkan DataOutputStream berfungsi untuk menulis suatu data ke dalam aliran dalam format biner.
    */
