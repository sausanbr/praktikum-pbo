/* Nama     : Sausan Berliana Arrizqi
 * NIM      : 24060122130092
 * Tanggal  : 3 Juni 2024
 * LAB C1
 */

public class Airport extends Airplane{
    private Airplane airplane;
    private String name;
    
    public void AirPort (String name) {
        this.name = name;
    }
    
    public String givePermissionToLand(IFlyer flyer) {
        if (flyer instanceof Airplane) {
            return "Izin untuk terbang diterima.";
        } else {
            return "Izin untuk terbang ditolak.";
        }
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
    public String toString() {
        return "Bandara: " + name;
    } 

    public void takeOff(){}
    public void land(){}
    public void fly(){}
}
