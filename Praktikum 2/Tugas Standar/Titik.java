/*  Nama        : Sausan Berliana Arrizqi
    NIM         : 24060122130092
    Tanggal     : 28 Februari 2024
    Deskripsi   : Enkapsulasi titik dengan eksperimen memberikan public atau private pada class ataupun method*/ 

public class Titik {
    private float absis;
    private float ordinat;
    private static int counterTitik;

    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public void setAbsis(float a){
        absis = a;
    }
    public void setOrdinat(float o){
        ordinat = o;
    }
    public float getAbsis(){
        return absis;
    }
    public float getOrdinat(){
        return ordinat;
    }

    public static int getCounterTitik(){
        return counterTitik;
    }

    public Titik (float newAbsis, float newOrdinat) {
        absis = newAbsis;
        ordinat = newOrdinat;
        counterTitik++;
    }

    public float getJarakPusat(){
        return (float)Math.sqrt(absis*absis + ordinat*ordinat);
    }

    public void refleksiX(){
        this.ordinat = -(this.ordinat);
    }

    public void refleksiY(){
        this.absis = this.absis*(-1);
    }

    public Titik getRefleksiX(){
        return new Titik (this.absis, -(this.ordinat));
    }
    public Titik getRefleksiY(){
        Titik t = new Titik(-(this.absis), this.ordinat);
        return t;
    } 

    /* Kesimpulan:
    Dengan memberikan akses private pada atribut dapat membatasi atribut tersebut dari akses luar kelas sehingga harus menggunakan 
    getter atau setter untuk mengakses dan memodifikasi nilai atribut. Sedangkan memberikan akses public pada konstruktor serta method,
    dapat memungkinkan untuk diakses dari luar kelas. */
}