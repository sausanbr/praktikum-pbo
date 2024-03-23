/*File      : Lingkaran.java 
/* Tanggal  : 23 Maret 2024 
/*Pembuat   : Sausan Berliana Arrizqi 
/* NIM      : 24060122130092 
/*Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar*/

import java.util.Scanner;

class MBujurSangkar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi bujur sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " Satuan adalah " + bs.hitungLuas(sisi));
    }    
}

/*Apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak
 yang ada pada kelas BangunDatar? jelaskan! */

 /*Jawaban : Tidak dapat memproses method dan mengeluarkan apapun yang ada di BujurSangkar 
 Karena superclassnya tidak memuat implementasi dari method hitung luas yang harus di 
 implementasikan pada setiap subclass dari superclass BangunDatar. */