import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
          /* Mesafe(km),yaş,Yolculuk tipi sor.
          Kmbaşı ücret 0.10 tl
           İlk olarak uçuşun toplam fiyatını hesaplayın ve
          sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın */



        /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
          yolculuk tipi ise 1 veya 2) olmalıdır.
          Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
          Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
          Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
          Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
          Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.*/

        int mesafe, yas, yolculukTipi;
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi  Km türünden giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();

        System.out.print("Sadece gidiş bileti almak için 1'e\n gidiş-dönüş bileti almak için 2'ye\n basınız.--->");
        yolculukTipi = input.nextInt();

        double normalTutar;
        normalTutar = mesafe * 0.10;

        boolean kosul1 = (yolculukTipi >= 1 && yolculukTipi <= 2);
        boolean kosul2 = (mesafe > 0);
        boolean kosul3 = (yas > 0);

        if (kosul1 && kosul2 && kosul3) {
            if (yolculukTipi == 1) {
                if (yas < 12) {
                    System.out.println("Bilet ücretiniz : " + normalTutar / 2);
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet ücretiniz : " + (normalTutar - (normalTutar * 0.10)));
                } else if (yas > 65) {
                    System.out.println("Bilet ücretiniz : " + (normalTutar - (normalTutar * 0.3)));

                } else
                    System.out.println("Bilet ücretiniz : " + normalTutar);


            } else if (yolculukTipi == 2) {
                if (yas < 12) {
                    System.out.println("Bilet ücretiniz : " + (normalTutar / 2 - ((normalTutar / 2) * 0.2)));
                } else if (yas >= 12 && yas <= 24) {
                    System.out.println("Bilet ücretiniz : " + ((normalTutar - (normalTutar * 0.1)) - ((normalTutar - (normalTutar * 0.1)) * 0.2)));

                } else if (yas > 65) {
                    System.out.println("Bilet ücretiniz : " + ((normalTutar - (normalTutar * 0.3)) - ((normalTutar - (normalTutar * 0.3)) * 0.2)));

                } else
                    System.out.println("Bilet ücretiniz : " + (normalTutar-(normalTutar*0.2)));
            }

            System.out.println("İyi yolculuklar dileriz.");


        } else {
            System.out.println("Hatalı veri girdiniz.");
        }








    }
}