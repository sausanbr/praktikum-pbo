/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanMedium;

/**
 *
 * @author sausanbr
 */
public class KontrolSenjata {
    private Senjata senjata;
    
    public KontrolSenjata(Senjata senjata){
        this.senjata = senjata;
    }
    
    public boolean isAdaPeluru(){
        return senjata.getPeluru()>0;
    }
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.println(">> Peluru berhasil ditambah: "+jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.println(">> Siap menembak " + jumlah + " kali");
        if (isAdaPeluru()){
            if (senjata.getPeluru() < jumlah) {
                for (int i = 0; i < senjata.getPeluru(); i++){
                    System.out.println(senjata.getBunyi() + " ");
                }
                for (int i = 0; i < jumlah - senjata.getPeluru(); i++){
                    System.out.println("Gagal tembak, Peluru Habis");
                }
                senjata.setPeluru(0);
            } else {
                for (int i = 0; i < jumlah; i++){
                    System.out.println(senjata.getBunyi() + " ");
                }
                senjata.setPeluru(senjata.getPeluru() - jumlah);
            }
            System.out.println(">> Peluru sisa: " + senjata.getPeluru());
        } else {
            System.out.println("Peluru Habis");
        }
    }

    public void menusuk (){
        senjata.setMenusuk(true);
        System.out.println ("Jleb!");
    }
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println ("Bayonet Terpasang");
    }
}

