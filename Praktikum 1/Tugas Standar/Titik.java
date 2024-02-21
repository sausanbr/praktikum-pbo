public class Titik {
    float absis;
    float ordinat;
    static int counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    void setAbsis(float a){
        absis = a;
    }
    void setOrdinat(float o){
        ordinat = o;
    }
    float getAbsis(){
        return absis;
    }
    float getOrdinat(){
        return ordinat;
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    Titik (float newAbsis, float newOrdinat) {
        absis = newAbsis;
        ordinat = newOrdinat;
        counterTitik++;
    }
}