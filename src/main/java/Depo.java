import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Depo {

    private List<Urunler> urunArray = new ArrayList<>();
    private List<Urunler> sepet = new ArrayList<>();

    public Depo() {

        Urunler urun1 = new Urunler("Gofret", 22, 100);
        Urunler urun2 = new Urunler("Biskuvi", 15, 150);
        Urunler urun3 = new Urunler("Lokum", 10, 50);
        Urunler urun4 = new Urunler("Cikolata", 30, 75);
        Urunler urun5 = new Urunler("Nutella", 89, 2);


        this.urunArray.add(urun1);
        this.urunArray.add(urun2);
        this.urunArray.add(urun3);
        this.urunArray.add(urun4);
        this.urunArray.add(urun5);
    }


    public void urunListesi() {

        for (Urunler w : this.urunArray) {
            System.out.println(w.getIsim() + " " + "Fiyati = " + w.getFiyati() + " " + "idNo = " + w.getUrunId());
            System.out.println();
        }
    }

    public  void urunSecme() {
        Scanner input = new Scanner(System.in);
        int secim;
        do {
            System.out.println("Lutfen Almak istediginiz urunun kodunu yaziniz");
            System.out.println("Cikmak icin O a basiniz");
            secim = input.nextInt();

            for (Urunler w: this.urunArray ) {

                if(secim == w.getUrunId()){

                    sepet.add(w);

                }

            }


        } while (secim!=0);

        System.out.println("---Sepetinizdeki Urunler---");

        for (Urunler w : this.sepet) {
            System.out.println(w.getIsim() + " " + "Fiyati = " + w.getFiyati() + " " + "idNo = " + w.getUrunId());
            System.out.println();
        }
        System.out.println("-----Bizi tercih Ettiginiz icin tesekkur ederiz yine bekleriz-----");

    }


}
