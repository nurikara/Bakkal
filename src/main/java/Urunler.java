public class Urunler {

   private static int count=100;
   private String isim;
   private double fiyati;
   private int urunId;

   private int  urunAdedi;



    public Urunler(String isim, double fiyati,int urunAdedi) {

        count++;
        this.isim = isim;
        this.fiyati = fiyati;
        this.urunAdedi=urunAdedi;
        this.urunId=count;
    }

    public String getIsim() {
        return isim;
    }

    public double getFiyati() {
        return fiyati;
    }

    public int getUrunId() {
        return urunId;
    }

    public int getUrunAdedi() {
        return urunAdedi;
    }
}
