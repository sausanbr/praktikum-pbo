/* Nama : Sausan Berliana Arrizqi
   NIM  : 24060122130092
   PBO C1
 */

public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }
    public double hitungKeliling(){
        return 2*jejari*3.14;
    }
}
