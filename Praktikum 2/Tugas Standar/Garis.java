/*  Nama        : Sausan Berliana Arrizqi
    NIM         : 24060122130092
    Tanggal     : 28 Februari 2024
    Deskripsi   : Enkapsulasi garis dengan eksperimen memberikan public atau private pada class ataupun method*/ 

    public class Garis {
        private Titik titikAwal;
        private Titik titikAkhir;
        static double counterGaris;
        
        //konstruktor
        public Garis(){
          titikAwal = new Titik();
          titikAkhir = new Titik();
          counterGaris++;
        }
      
        public Garis(Titik titikAwal, Titik titikAkhir){
          this.titikAwal = titikAwal;
          this.titikAkhir = titikAkhir;
          counterGaris++;
        }
        
        //method getter dan setter
        public Titik getTitikAwal(){
          return this.titikAwal;
        }
      
        public Titik getTitikAkhir(){
          return this.titikAkhir;
        }
      
        static double getCounterGaris(){
          return counterGaris;
        }
      
        public void setTitikAwal(Titik titikAwal){
          this.titikAwal = titikAwal;
        }
      
        public void setTitikAkhir(Titik titikAkhir){
          this.titikAkhir = titikAkhir;
        }

        public double getPanjang (){
            double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
            double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
            return Math.sqrt((deltaX*deltaX) + (deltaY*deltaY));
        }

        public double getGradien(){
            double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
            double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
            return (deltaY/deltaX);
        }

        public Garis getRefleksiY(){
            Titik titikAwalRefleksi = new Titik(-titikAwal.getAbsis(), titikAwal.getOrdinat());
            Titik titikAkhirRefleksi = new Titik(-titikAkhir.getAbsis(), titikAkhir.getOrdinat());
            Garis g = new Garis(titikAwalRefleksi, titikAkhirRefleksi);
            return g;
        }

        public boolean isTegakLurus(Garis g){
            return this.getGradien()*g.getGradien() == -1;
        }
      }