/* Nama     : Sausan Berliana Arrizqi
 * NIM      : 24060122130092
 * Tanggal  : 3 Juni 2024
 * LAB C1
 */

public class Truck extends Vehicle {
    private double maxLoad;
    
    public Truck(double maxLoad){
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
}
