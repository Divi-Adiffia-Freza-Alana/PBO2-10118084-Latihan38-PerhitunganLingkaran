/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118084.latihan38.perhitunganlingkaran;

import java.util.Scanner;

/**
 *
*Nama  : Divi Adiffia Freza Alana
*Kelas : PBO2
*Nim   : 10118084
*Deskripsi Program : Program ini berisi program untuK menghitung lingkaran

 */
public class lingkaran {
    double jarijari;
    double luas;
    double keliling;
    
    public void hitunglingkaran(){
        Scanner Scanner = new Scanner (System.in);
        System.out.println("========Perhitungan Lingkaran======"); 
        System.out.print("Masukkan nilai diameter Lingkaran :");
        while (!Scanner.hasNextDouble()) {
        System.out.println("Nilai Diameter Tidak Sesuai ");
        Scanner.nextLine();
        System.out.print("Masukkan nilai diameter Lingkaran :"); 
     }
     double diameter = Scanner.nextDouble();
     jarijari=0.5*diameter;
     luas =Math.PI*jarijari*jarijari;
     keliling=Math.PI*2*jarijari;
        System.out.println("Jari-Jari lingkarang = "+jarijari+" cm");
        System.out.println("Jari-Jari lingkarang = "+luas+" cm");
        System.out.println("Jari-Jari lingkarang = "+keliling+" cm");

        
    }
}
