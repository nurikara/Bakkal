import java.util.ArrayList;
import java.util.List;

public class Depo implements Methodlar {

     static  List<Urunler> urunArray= new ArrayList<>();
    public void urunLisi(){

        Urunler urun1 = new Urunler("Gofret",22);
        Urunler urun2 = new Urunler("Biskuvi",15);
        Urunler urun3 = new Urunler("Lokum",10);
        Urunler urun4 = new Urunler("Cikolata",30);
        Urunler urun5 = new Urunler("Nutella",89);


        this.urunArray.add(urun1);
        this.urunArray.add(urun2);
        this.urunArray.add(urun3);
        this.urunArray.add(urun4);
        this.urunArray.add(urun5);
    }


    @Override
    public void urunListeOlustur() {

    }
}
