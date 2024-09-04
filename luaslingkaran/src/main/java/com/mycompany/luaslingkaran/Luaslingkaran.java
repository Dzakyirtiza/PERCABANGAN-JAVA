package com.mycompany.luaslingkaran;

import java.util.Locale;
import java.util.Scanner;


public class Luaslingkaran {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("## Program java Menghitung Luas Lingkaran ##");
        System.out.println("============================================");
        System.out.println();
        
        double r, luas;
        
        System.out.println("Input Jari Jari Lingkaran: ");
        r = input.nextDouble();
        
        luas = 3.14 * r * r;
        
        System.out.println("Luas lingkaran: "+luas);
    }
}