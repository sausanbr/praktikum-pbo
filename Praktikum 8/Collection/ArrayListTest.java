/* Nama : Sausan Berliana Arrizqi
   NIM  : 24060122130092
   PBO C1
 */

import java.util.ArrayList;

public class ArrayListTest{
    public static void main (String[] args){
        // inisialisasi ArrayList yang hanya dapat berisi objek String
        ArrayList<String> strings = new ArrayList<String>();
        // menambah elemen
        strings.add("Praktikum");
        strings.add("Collection");
        strings.add("Dan Generic");

        // menghapus elemen
        strings.remove ("Praktikum");

        // iterasi pada keseluruhan ArrayList
        for (String s: strings){
            System.out.print(s+" ");
        }
    }
}