import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {

        int yil;
        Scanner input=new Scanner(System.in);
        System.out.print("Yıl giriniz : ");
        yil=input.nextInt();

        //Öncelikle girilen yılın 100'ün katı olup olmadığını kontrol edelim.

        int yilhesabi1 =yil%100;

        if (yilhesabi1==0){
            //Eğer 100'ün katı ise 400'e bölünüp bölünmediğini kontrol ediyoruz.
            int yilhesabi2=yil%400;

            if (yilhesabi2==0){
                System.out.println(yil+" bir arık yıldır");
            }else{
                System.out.println(yil+" bir artık yıl değildir");
            }
        }else {
            //100'ün katı değil ise 4'e bölünüp bölünmediğini kontrol ederiz.
            int yilhesabi3=yil%4;

            if (yilhesabi3==0){
                System.out.println(yil+" bir artık yıldır.");
            }else {
                System.out.println(yil+" bir artık yıl değildir.");
            }
        }


    }
}
