/*  Nama        : Sausan Berliana Arrizqi
    NIM         : 24060122130092
    Tanggal     : 28 Februari 2024
    Deskripsi   : Enkapsulasi garis dengan eksperimen memberikan public atau private pada class ataupun method*/ 

    public class MGaris {
        public static void main(String[] args) {
            Garis g1;
            Garis g2;

            g1 = new Garis();
            g2 = new Garis();

            double counterGaris;
            Titik titikAwal;
            Titik titikAkhir;

            g1.setTitikAwal(new Titik(1,2));
            g1.setTitikAkhir(new Titik(5, 6));

            g2.setTitikAwal(new Titik(2,2));
            g2.setTitikAkhir(new Titik(6, 4));
  
            counterGaris = Garis.getCounterGaris();
            System.out.println("Jumlah objek garis: " +counterGaris);
    
            titikAwal = g1.getTitikAwal();
            System.out.println("Titik awal garis g1: (" + titikAwal.getAbsis() + ", " + titikAwal.getOrdinat() + ")");
            
            titikAkhir = g1.getTitikAkhir();
            System.out.println("Titik akhir garis g2: (" + titikAkhir.getAbsis() + ", " + titikAkhir.getOrdinat() + ")");

            //getPanjang
            System.out.println("Panjang garis g1: " + g1.getPanjang());
            System.out.println("Panjang garis g2: " + g2.getPanjang());

            //getGradien
            System.out.println("Gradien garis g1: " + g1.getGradien());
            System.out.println("Gradien garis g2: " + g2.getGradien());

            //getRefleksiY
            Garis g3 = g1.getRefleksiY();
            System.out.println("Titik awal g1 setelah refleksi: (" + g3.getTitikAwal().getAbsis() + ", " + g3.getTitikAwal().getOrdinat() + ")");
            System.out.println("Titik akhir g1 setelah refleksi: (" + g3.getTitikAkhir().getAbsis() + ", " + g3.getTitikAkhir().getOrdinat() + ")");
            
            Garis g4 = g2.getRefleksiY();
            System.out.println("Titik awal g2 setelah refleksi: (" + g4.getTitikAwal().getAbsis() + ", " + g4.getTitikAwal().getOrdinat() + ")");
            System.out.println("Titik akhir g2 setelah refleksi: (" + g4.getTitikAkhir().getAbsis() + ", " + g4.getTitikAkhir().getOrdinat() + ")");
            
            
            //isTegakLurus
            System.out.println("Apakah garis g1 tegak lurus dengan garis g2? " + g1.isTegakLurus(g2));
        }
}