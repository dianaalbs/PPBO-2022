//  Nama    : Diana Adilla Lubis
//  NIM     : M0521018

class MyThread extends Thread {
    int length;
    String marker;

    public MyThread(int length, String marker){
        this.length = length;
        this.marker = marker;

        var mainThread = Thread.currentThread().getName();
        System.out.println(this.getName() + " is created on " + mainThread);
    }

    @Override
    public void run(){
        int count = 0;
        while(count < length){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            count++;
            var progressString = getProgress(count, marker);
            System.out.println(this.getName() + ": " + progressString);
        }
    }

    private String getProgress(int count, String marker){
        var result = "";
        for(int i=0; i<count; i++){
            result+=marker;
        }

        return result;
    }
}

public class PPBO_11_Latihan1 {
    public static void main(String[] args) {
        System.out.println("Hello from thread '" + Thread.currentThread().getName() + "'\n");

        var thread1 = new MyThread(10, "#");
        var thread2 = new MyThread(5, ">");

        thread1.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread2.start();
    }
}

/* 
 * Jawablah pertanyaan berikut
 * 1. Jelaskan mengapa program di atas tidak bisa dijalankan (memiliki error/exception)
 *    Jawab : Karena pada saat menggunakan fungsi sleep() tidak ada IntterruptedException 
 * 
 * 
 * 2. Jelaskan dan terapkan bagaimana cara mengatasinya. Kemudian, kumpulkan program dalam keadaan sudah bisa dijalankan
 *    Jawab : dengan menambahkan try dan catch untuk mengatasi InterruptedException.
 * 
 * 
 * 3. Jelaskan secara singkat algoritma program di atas
 *    Jawab : Program diatas akan membuat dua buah objek thread bernama "thread0" dan "thread1".
 *            Dimana thread0 akan mencetak # sebanyak 1 - 10, dengan mencetak i dikali dengan # setiap perulangannya.
 *            Kemudian, thread1 akan mencetak > sebanyak  1 - 5, dengan mencetak i dikali dengan > setiap perulangannya.
 * 
*/