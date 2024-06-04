/* Nama     : Sausan Berliana Arrizqi
 * NIM      : 24060122130092
 * Tanggal  : 3 Juni 2024
 * LAB C1
 */

public class Helicopter extends Airplane{
    private double maxLoad;
        
    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    @Override
    double calcFuelEfficency() {
        return 0;
    }
    
    @Override
    double calcTripDistance() {
        return 0;
    }

    @Override
    public void takeOff(){}

    @Override
    public void land(){}

    @Override
    public void fly(){}
}
