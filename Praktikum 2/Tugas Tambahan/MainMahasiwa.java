/*  Nama        : Sausan Berliana Arrizqi
    NIM         : 24060122130092
    Tanggal     : 1 Maret 2024
    Deskripsi   : Tugas Tambahan Praktikum 2 (Enkapsulasi & Relasi Mahasiswa dan WaliMahasiswa)*/

public class MainMahasiwa {
    public static void main(String[] args) {
        // Data Wali Mahasiswa
        WaliMahasiswa dimas = new WaliMahasiswa("Riyanto", "082337042367", "Rembang");
        WaliMahasiswa agus = new WaliMahasiswa("Agus Setiaji", "08234567891", "Pekalongan");
        WaliMahasiswa marhadi = new WaliMahasiswa("Marhadi", "082341589176", "Tangerang");

        // Data Mahasiswa
        Mahasiswa sausan = new Mahasiswa("Sausan Berliana Arrizqi", "24060122130092", "Informatika", dimas);      
        Mahasiswa rona = new Mahasiswa("Rona Realita Najma", "24060122140124", "Teknik Sipil", agus);
        Mahasiswa sabrina = new Mahasiswa("Aniqah Nursabrina", "24060122120036", "Informatika", marhadi);

        // Pemanggilan Method Cetak
        sausan.cetak();
        rona.cetak();
        sabrina.cetak();
    }
}
