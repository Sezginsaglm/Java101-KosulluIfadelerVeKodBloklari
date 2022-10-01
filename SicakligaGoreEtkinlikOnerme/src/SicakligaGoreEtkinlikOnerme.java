import java.util.Scanner ;

public class SicakligaGoreEtkinlikOnerme {
    public static void main(String[] args) {

        int sicaklik ;
        Scanner input=new Scanner(System.in) ;

        System.out.print("Hava sıcaklığı : ") ;
        sicaklik=input.nextInt() ;

        if (sicaklik<5){
            System.out.println("Kayak daha uygun ") ;
        } else if (sicaklik==15) {
            System.out.println("Sinema veya Piknik uygun ") ;
        } else if (sicaklik >= 5 && sicaklik <15) {
            System.out.println("Sinema daha uygun ") ;
        } else if (sicaklik > 15 && sicaklik<=25) {
            System.out.println("Piknik daha uygun ") ;
        } else if (sicaklik > 25) {
            System.out.println("Yüzme daha uygun " ) ;

        }
    }
}
