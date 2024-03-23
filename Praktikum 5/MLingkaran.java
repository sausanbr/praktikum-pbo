/*File      : Lingkaran.java 
/* Tanggal  : 23 Maret 2024 
/*Pembuat   : Sausan Berliana Arrizqi 
/* NIM      : 24060122130092 
/*Deskripsi : implementasi cara menghitung luas lingkaran */

import java.util.Scanner;

public class MLingkaran {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jejari Lingkaran: ");
        double sisi = scan.nextDouble();
        Lingkaran l = new Lingkaran(10.2);
        System.out.println("Luas lingkaran dengan " + "jejari 10.2 satuan adalah " + l.hitungLuas());
    }
}
