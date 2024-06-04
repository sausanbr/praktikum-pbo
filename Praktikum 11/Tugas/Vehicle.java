/* Nama     : Sausan Berliana Arrizqi
 * NIM      : 24060122130092
 * Tanggal  : 3 Juni 2024
 * LAB C1
 */

abstract class Vehicle {
    abstract double calcFuelEfficency();
    abstract double calcTripDistance();
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
