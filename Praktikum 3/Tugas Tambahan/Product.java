/* Nama         : Sausan Berliana Arrizqi
   NIM          : 24060122130092
   Tanggal      : 10 Maret 2024
   Deskripsi    : Program untuk asersi kelas Product */

public class Product {
    private String name;
    private int stock;
    private int price;
    public Product() {
      this.name = "";
      this.stock = 0;
      this.price = 0;
    }
    public Product(String name, int stock, int price) {
      this.name = name;
      this.stock = stock;
      this.price = price;
    }
    public String getName() {
      return name;
    }
    public int getStock() {
      return stock;
    }
    public int getPrice() {
      return price;
    }
    public void setName(String name){
        assert (!name.isEmpty()) : "Nama produk tidak boleh kosong!";
        this.name = name;
    }
    public void setStock(int stock){
        assert (stock>=0) : "Jumlah stock yang dimasukkan harus positif!";
        this.stock = stock;
    }
    public void setPrice(int price) {
        assert (price>=0): "Jumlah harga yang dimasukkan harus positif!";
        this.price = price;
    }
    public void purchaseProduct(int quantity) {
        assert (quantity>0): "Quantity product yang dibeli harus positif!";
        assert (stock>=quantity): "Stock produk yang tersedia tidak mencukupi";
        this.stock = stock - quantity;
    }
    public void addStock(int quantity) {
      assert (quantity>0): "Quantity product yang ditambahkan harus positif!";
      this.stock = stock + quantity;
    } 
}