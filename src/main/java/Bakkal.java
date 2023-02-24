import java.util.Scanner;

public class Bakkal extends Islemler {

    public static void main(String[] args) {
        start();
    }

    public static void start() {

        Scanner input = new Scanner(System.in);

        int secim;

        do {

            System.out.println("Urun listelemek icin 1 \n Urun secmek icin 2 " +
                    "\n Odeme yapmak icin 3 \n Cikis yapmak icin 0 ");

            secim=input.nextInt();

            switch (secim) {

                case 1://UrunListesi
                    break;

                case 2: //UrunSecme()
                    break;
                case 3: //OdemeYapma()
                    break;
                case 0: //Cikis()
                    System.out.println("Tekrar bekleriz...");
                    break;
                default:
                    System.out.println("Hatali giris yaptiniz tekrar deneyiniz.");
            }
        } while (secim!=0);

    }
}
