/* Nama     : Sausan Berliana Arrizqi
 * NIM      : 24060122130092
 * Tanggal  : 3 Juni 2024
 * LAB C1
 */

import java.util.*;

public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang;
        koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman ("superman");
        IFlyer superboy = new Superman ("superboy");
        IFlyer supergirl = new Superman ("supergirl");
        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add (merpati); 
        koleksiBisaTerbang.add (eagle);
        koleksiBisaTerbang.add (superman); 
        koleksiBisaTerbang.add (supergirl);
        koleksiBisaTerbang.add (superboy);

        for (IFlyer bisaTerbang: koleksiBisaTerbang){
            if (bisaTerbang instanceof Superman){
                System.out.println("I'm " + ((Superman)bisaTerbang).getName());
                System.out.println("Bangsa: " + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.println("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            } else{
                System.out.println("I'm "+ bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa terbang");
                System.out.print ("Makan: ");
                ((Animal)bisaTerbang).eat();
                System.out.println("");
            }
        }
    }
}
