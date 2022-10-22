//Nama  : Diana Adilla Lubis
// NIM  : M0521018

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class StringMethod {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input =  scan.nextLine();

        for(int i = 0; i < input.length(); i++) {
            if(i % 3 == 0) {
                System.out.print(input.charAt(i));
            }
        }
    }
}