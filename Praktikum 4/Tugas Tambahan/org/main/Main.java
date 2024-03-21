/* File         : Main.java
 * Penulis      : Sausan Berliana Arrizqi
 * Tanggal      : 19 Maret 2024
 * Deskripsi    : Driver class untuk orang, mahasiswa, dan wali mahasiswa
 */

package org.main;

import org.walimahasiswa.*;
import org.mahasiswa.*;


public class Main {
    public static void main(String[] args) {
        // Data Wali Mahasiswa
        WaliMahasiswa dimas = new WaliMahasiswa("Dimas Totok", "3317106710700001", "082337042367", "Desa Pandean RT 2 RW 2, Rembang");
        WaliMahasiswa abian = new WaliMahasiswa("Abimala Admaja", "3317106806750001", "085427042359", "Jalan Jatisari No 19, Semarang");
        WaliMahasiswa daniel = new WaliMahasiswa("Daniel Caesar", "3317106009810001", "081254728194", "Jalan Sumurboto Dalam II No 2, Semarang");
        
        // Data Mahasiswa
        Mahasiswa sausan = new Mahasiswa("Sausan Berliana", "3317106806040002", "24060122130092", "Informatika", dimas);
        Mahasiswa dara = new Mahasiswa("Dara Admaja", "3317106103040003", "12060122120008", "Hukum", abian);
        Mahasiswa ariana = new Mahasiswa("Ariana Caesar", "3317106507020002", "23060120140150", "Kedokteran", daniel);

        sausan.cetak();
        dara.cetak();
        ariana.cetak();
    }
}
