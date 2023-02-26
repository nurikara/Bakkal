import java.util.Scanner;

public class Bakkal {

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        Depo depo = new Depo();

        Scanner input = new Scanner(System.in);

        int secim;

        do {
            System.out.println("-----lutfen Secimizi Yapini-----");
            System.out.println();
            System.out.println(" Urun listelemek icin 1 \n Urun secmek icin 2 " +
                    " \n Odeme ve Cikis  icin 0 ");
            System.out.println();

            secim = input.nextInt();

            switch (secim) {

                case 1:
                    depo.urunListesi();
                    break;

                case 2:
                    depo.urunSecme();
                    break;
                case 0:

                    System.out.println("Tekrar bekleriz...");

                    depo.odemeHesaplama();
                    break;

                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyiniz.");

                    System.out.println();
            }
        } while (secim != 0);

    }
}
