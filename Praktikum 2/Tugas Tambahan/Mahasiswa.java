/*  Nama        : Sausan Berliana Arrizqi
    NIM         : 24060122130092
    Tanggal     : 1 Maret 2024
    Deskripsi   : Tugas Tambahan Praktikum 2 (Enkapsulasi & Relasi Mahasiswa dan WaliMahasiswa)*/

public class Mahasiswa{
    private String nama;
    private String nim;
    private String jurusan;
    private WaliMahasiswa wali;

    public Mahasiswa(String nama, String nim, String jurusan, WaliMahasiswa wali){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali; 
    }

    public String getNama(){
        return nama;
    }

    public String getNim(){
        return nim;
    }

    public String getJurusan(){
        return jurusan;
    }

    public WaliMahasiswa getWali(){
        return wali;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim(String nim){
        this.nim = nim;
    }

    public void setJurusan(String jurusan){
        this.jurusan = jurusan;
    }

    public void setWali(WaliMahasiswa wali){
        this.wali = wali;
    }

    public void cetak(){
        System.out.println("======= Data Mahasiswa =======");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("--- Data Wali Mahasiswa ---"); 
        System.out.println("Nama: " + wali.getNama()); 
        System.out.println("Nomor Hp: " + wali.getNomorHp()); 
        System.out.println("Alamat: " + wali.getAlamat() + "\n");
    }
}
