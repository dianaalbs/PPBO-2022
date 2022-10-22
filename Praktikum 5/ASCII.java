//Nama  : Diana Adilla Lubis
// NIM  : M0521018

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ASCII {
    public static void main(String args[] ) throws Exception {
        char input1, input2, temp;
        Scanner input = new Scanner(System.in);

        input1 = input.next().charAt(0);
        input2 = input.next().charAt(0);
        input.close();
        
        if(input1 > input2){
            temp = input2;
            input2 = input1;
            input1 = temp;
        }

        String hasil = "";
        while(input1 <= input2){
            hasil += input1;
            input1++;
        }
        
        System.out.print(hasil);
    }
}