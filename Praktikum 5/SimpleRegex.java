//Nama  : Diana Adilla Lubis
// NIM  : M0521018

import java.util.Scanner;

public class SimpleRegex {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        String input =  scan.nextLine();

        if(input.matches("^[AIUEOaiueo].*")) {
            System.out.println(1);
        } 
        else if(input.matches(".*ng$")) {
            System.out.println(2);
        } 
        else {
            System.out.println(-1);
        }
    }
}