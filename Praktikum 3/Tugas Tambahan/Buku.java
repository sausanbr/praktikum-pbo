/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 10 Maret 2024
   Deskripsi    : Program untuk kelas Buku */

public class Buku {
    private String judul;
    private boolean tersedia;
    public Buku(String judul) {
         this.judul = judul;
         tersedia = true;
    }
    public String getJudul() {
         return judul;
    }
    public boolean isTersedia() {
         return tersedia;
    }
    public void setJudul(String judul) {
         this.judul = judul;
    }
    public void setTersedia(boolean tersedia) {
         this.tersedia = tersedia;
    } 
}