/* File       : BangunDatar.java 
/* Tanggal   : 23 Maret 2024 
/* Pembuat   : Sausan Berliana Arrizqi 
/* NIM       : 24060122130092 
/* Deskripsi : Kelas abstrak, berisi abstraksi bangun datar */

public abstract class BangunDatar {
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = 1;
    }

    public double getLuas(){
        return luas;
    }
}