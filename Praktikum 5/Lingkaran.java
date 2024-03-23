/*File      : Lingkaran.java 
/* Tanggal  : 23 Maret 2024 
/*Pembuat   : Sausan Berliana Arrizqi 
/* NIM      : 24060122130092 
/*Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    private double jejari;

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI * jejari * jejari;
    }
}
