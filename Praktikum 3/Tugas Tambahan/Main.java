/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 10 Maret 2024
   Deskripsi    : Program untuk main kelas Buku, Anggota, serta eksepsi */

public class Main {
    public static void main(String[] args) {
        // Data Buku
        Buku MID = new Buku("Midnights in December");
        Buku PIOH = new Buku("Poetry in Our Heads");
        Buku WSBLT = new Buku("We Shouldn't Be Like This");
        Buku LTIL = new Buku("Lost Then I Learned");
        Buku AL = new Buku("Alster Lake");
        Buku P = new Buku("Pulang");

        // Data Anggota
        Anggota sausan = new Anggota("Sausan");
        Anggota kalisa = new Anggota("Kalisa");
        Anggota greta = new Anggota("Greta");
        Anggota tsa = new Anggota("Tsahara");
        Anggota bareska = new Anggota("Bareska");
        Anggota ghyani = new Anggota("Ghyani");

        try {
            // Peminjaman berhasil
            sausan.pinjamBuku(MID);
            System.out.println("Buku berhasil dipinjam");

            // Batas maksimum peminjaman
            tsa.pinjamBuku(P);
            tsa.pinjamBuku(AL);
            tsa.pinjamBuku(LTIL);
            tsa.pinjamBuku(WSBLT);

            // Buku tidak tersedia 
            kalisa.pinjamBuku(PIOH);
            greta.pinjamBuku(PIOH);
            ghyani.pinjamBuku(PIOH);
            bareska.pinjamBuku(PIOH);

            //System.out.println("Buku berhasil dipinjam");

        } catch (MaksimumBukuTerpinjamException e) {
            System.out.println("Peminjaman Gagal: " +e.getMessage());
        } catch (BukuTidakTersediaException e){
            System.out.println("Peminjaman Gagal: " + e.getMessage() );
        }
    } 
}