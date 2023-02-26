import java.util.Scanner;

public class Bakkal extends Islemler {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Depo d1 = new Depo();

        Scanner input = new Scanner(System.in);

        int secim;

        do {
            System.out.println("-----Devam Etmek Icin Secimizi Yapini-----");
            System.out.println(" Urun listelemek icin 1 \n Urun secmek icin 2 " +
                    " \n Odeme ve Cikis  icin 0 ");
            System.out.println();

            secim = input.nextInt();

            switch (secim) {

                case 1:
                    d1.urunListesi();
                    break;

                case 2: d1.urunSecme();
                    break;
                case 0:

                    System.out.println("Tekrar bekleriz...");//OdemeYapma()
                    break;

                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyiniz.");

                    System.out.println();
            }
        } while (secim != 0);

    }
}
