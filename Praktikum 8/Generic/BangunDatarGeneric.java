/* Nama : Sausan Berliana Arrizqi
   NIM  : 24060122130092
   PBO C1
 */

public class BangunDatarGeneric <T extends BangunDatar> {
    private T bangunDatar;

    public void set(T tipeBangunDatar){
        bangunDatar = tipeBangunDatar;
    }
    public T get(){
        return bangunDatar;
    }
    public double hitungKeliling(){
        return bangunDatar.hitungKeliling();
    }
}
