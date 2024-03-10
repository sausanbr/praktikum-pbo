/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 10 Maret 2024
   Deskripsi    : Main program untuk asersi kelas Product */

public class MProduct {
    public static void main(String[] args) {
    Product product = new Product("Laptop", 4, 500);
    System.out.println("Product Name: " + product.getName()); 
    System.out.println("Product Stock: " + product.getStock());
    System.out.println("Product Price: " + product.getPrice());
    product.purchaseProduct(5); 
    System.out.println("Product Stock: " + product.getStock());
    }
  }