
import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        int x,y,select;

        Scanner input=new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz : ");
        x = input.nextInt();

        System.out.print("İkinci Sayıyı Giriniz : ");
        y=input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {

            case 1:
                System.out.println("Sonuç : " +(x+y));
                break;

            case 2:
                System.out.println("Sonuç : " +(x-y));
                break;

            case 3:
                System.out.println("Sonuç : " +(x*y));

            case 4:
                if (y == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.") ;
                }else System.out.println("Sonuç : " +(x/y));
                break;

            default:
                System.out.println("Yanlış seçim yaptınız.Lütfen tekrar deneyiniz.");

        }
    }

}

