// Nama         : Sausan Berliana Arrizqi
// NIM          : 24060122130092
// Tanggal      : 6 Maret 2024
// Deskripsi    : Program untuk menunjukkan asersi

public class asersi1{
    public static void main(String[] args) {
        int x = -1;
        if (x>=0){
            System.out.println("x bilangan positif");
        } else {
            assert(x<0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}