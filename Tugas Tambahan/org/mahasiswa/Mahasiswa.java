/* File         : Mahasiswa.java
 * Penulis      : Sausan Berliana Arrizqi
 * Tanggal      : 19 Maret 2024
 * Deskripsi    : Representasi dasar dari objek mahasiswa 
 */


package org.mahasiswa;

import org.orang.Orang;
import org.walimahasiswa.WaliMahasiswa;

public class Mahasiswa extends Orang{
    private String nim, jurusan;
    private WaliMahasiswa wali; 
    
    public Mahasiswa(String nama, String nik, String nim, String jurusan, WaliMahasiswa wali){
        super(nama, nik);
        this.nim = nim;
        this.jurusan = jurusan;
        this.wali = wali;
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
    public void setNim (String nim){
        this.nim = nim;
    }
    public void setJurusan (String jurusan){
        this.jurusan = jurusan;
    }
    public void setWali (WaliMahasiswa wali){
        this.wali = wali;
    }
    public void cetak(){
        System.out.println("===== Data Mahasiswa =====");
        super.cetak();
        System.out.println("NIM \t\t: " +getNim());
        System.out.println("Jurusan \t: " +getJurusan());
        wali.cetak();
        System.out.println("\n");

    }
}
