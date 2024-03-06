/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 6 Maret 2024
   Deskripsi    : Program penggunaan exception buatan sendiri
                 Pengenalan klausa 'throw' dan 'throws' */

public class AngkaSial {
    public void cobaAngka (int angka) throws AngkaSialException{
        if (angka==13){
            throw new AngkaSialException();
        }
        System.out.println(angka+" bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        } catch (AngkaSialException ase) {
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("Hati-hati memasukkan angka!!!");
        }
    }
}

/* Ketika eksepsi terjadi, baris 12 tidak dieksekusi karena program langsung 
   dilempar (throw) ke AngkaSialException yang mengeluarkan pesan sesuai di
   AngkaSialException yaitu "Jangan memasukkan angka 13 karena angka sial!!!"
   Setelah melakukan try dan terdapat eksepsi pada as.cobaAngka(13); maka eksepsi
   akan ditangkap dan mengeluarkan pesan "Hati-hati memasukkan angka!!!" setelah
   mengeluarkan message di AngkaSialException. Lalu program setelahnya tidak dijalankan lagi */