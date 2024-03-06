/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 6 Maret 2024
   Deskripsi    : Program untuk demo asersi, yang akan menolak input jari-jari
                  lingkaran yang bernilai nol */

class Lingkaran {
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert(jariJari!=0): "Jari-jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

/* Secara konsep, program di modul kurang tepat karena pada assert dituliskan assert(jariJari>0)
   dimana jika jari-jari >= 0 tetap bisa dieksekusi methodnya (hitungKeliling) karena seharusnya 
   yang masuk ke assert adalah jika jari-jari tidak sama dengan 0. Maka perbaikan program yang tepat 
   adalah assert(jariJari!=0) */