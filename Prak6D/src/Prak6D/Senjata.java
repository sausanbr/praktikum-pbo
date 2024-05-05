/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak6D;

/**
 *
 * @author sausanbr
 */

public class Senjata {
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.peluru = 0;
    }
    
    public String getBunyi() {
        return bunyi;
    }
    
    public int getPeluru() {
        return peluru;
    }
    
    public void menembak() {
        if (peluru > 0) {
            System.out.println(bunyi + " ");
            peluru--;
        } else {
            System.out.println("Tidak bisa menembak, peluru habis!");
        }
    }
    
    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }
    
    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }    
}
