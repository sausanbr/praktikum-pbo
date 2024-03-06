/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 6 Maret 2024
   Deskripsi    : Program penggunaan eksepsi menggunakan class library Java */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayInteger = new Integer[4];
        try {
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
            System.out.println("Berhasil"); //cek
        } catch (ArrayIndexOutOfBoundsException exception){ //Urutan menulis exception sesuai hierarki
            //exception.printStackTrace();
            System.out.println("Indeks error");
        } catch (Exception exception){
            System.out.println("Error umum");
        } finally {
            System.out.println("clean up code...");
        }
        System.out.println("CEKKKKK");
    }
}

