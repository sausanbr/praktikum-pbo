/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 6 Maret 2024
   Deskripsi    : Eksepsi buatan sendiri, menolak masukan angka 13 */

public class AngkaSialException extends Exception{
    public AngkaSialException(){
        super("Jangan memasukkan angka 13 karena angka sial!!!");
    }
}