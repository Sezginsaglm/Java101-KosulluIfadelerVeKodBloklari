import java.util.Scanner ;

public class DersNotuHesaplama {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, muzik, toplamNot = 0, toplamDersSayisi = 0 ;
        double ortalama ;

        Scanner input = new Scanner(System.in) ;

        System.out.print("Matematik notunuzu giriniz : ") ;
        mat = input.nextInt() ;
        if (mat <= 100 && mat >= 0){
            toplamNot += mat ;
            toplamDersSayisi++ ;
        }

        System.out.print("Fizik notunuzu giriniz : ") ;
        fizik = input.nextInt() ;
        if (fizik<= 100 && fizik >= 0){
            toplamNot += fizik ;
            toplamDersSayisi++ ;
        }

        System.out.print("Kimya notunuzu giriniz : ") ;
        kimya = input.nextInt() ;
        if (kimya <= 100 && kimya >= 0){
            toplamNot += kimya ;
            toplamDersSayisi++ ;
        }

        System.out.print("Türkçe notunuzu giriniz : ") ;
        turkce = input.nextInt() ;
        if (turkce <= 100 && turkce >= 0){
            toplamNot += turkce ;
            toplamDersSayisi++ ;
        }

        System.out.print("Müzik notunuzu giriniz : ") ;
        muzik=input.nextInt() ;
        if (muzik <= 100 && muzik >= 0){
            toplamNot += muzik ;
            toplamDersSayisi++ ;
        }

        ortalama=toplamNot/toplamDersSayisi ;
        if (toplamDersSayisi==5){

            if (ortalama>55){
                System.out.println("Sınıfı başarıyla geçtiniz") ;
            }else {
                System.out.println("Sınıfta kaldınız. ") ;
            }
            System.out.println("Not ortalamanız : "+ortalama);
        }else {
            System.out.println("Hatalı not girişi yaptınız.Ders notlarınızı 0 ile 100 arasında girmelisiniz.");
            System.out.println("Doğru girdiğiniz not sayısı : "+toplamDersSayisi);
        }
    }
}