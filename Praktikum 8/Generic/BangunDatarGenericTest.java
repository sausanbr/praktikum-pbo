/* Nama : Sausan Berliana Arrizqi
   NIM  : 24060122130092
   PBO C1
 */

public class BangunDatarGenericTest {
    public static void main(String[] args) {
        Lingkaran l = new Lingkaran(2);
        BangunDatarGeneric<Lingkaran> bdg = new BangunDatarGeneric<Lingkaran>();
        bdg.set(l);
        System.out.println("Keliling Lingkaran : "+bdg.hitungKeliling());
        System.out.println("Tipe Generic : "+bdg.get().getClass().getName());

        System.out.println("=====================================================");
        Pesergi p = new Pesergi(8);
        BangunDatarGeneric<Pesergi>bdg2 = new BangunDatarGeneric<Pesergi>();
        bdg2.set(p);
        System.out.println("Keliling Persegi : " +bdg2.hitungKeliling());
        System.out.println("Tipe Generic: "+bdg2.get().getClass().getName());

    }
}
