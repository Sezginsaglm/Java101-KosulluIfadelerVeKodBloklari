import java.util.Scanner;
// Kullanıcı Girişi Örnek Çalışmasıdır..
// Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
// eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
// ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana
// "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu"
// yazan programı yazınız.
public class KullaniciGirisi {
    public static void main(String[] args) {
        //Değişkenlermizi oluşturuyoruz.
        String kullaniciAdi, sifre, sifirlama,yeniSifre;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        kullaniciAdi = input.nextLine();

        System.out.println("Şifreniz : ");
        sifre = input.nextLine();

        if (kullaniciAdi.equals("Patika") && sifre.equals("Java123")) {
            System.out.println("Giriş Başarılı");
        } else {
            System.out.println("Hatalı şifre girdiniz.Yeni şifre oluşturmak isterseniz \"y\" İstemezseniz \" n\" seçin");
        }
        sifirlama = input.nextLine();

        if (sifirlama.equals("n")){
            System.out.println("Oturumunuz sonlandırıldı.");

        }else if(sifirlama.equals("y")){
            System.out.println("Yeni Şifrenizi Giriniz: ");
            yeniSifre=input.nextLine();

            if (yeniSifre.equals("Java123")){
                System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz.Lütfen farklı bir şifre deneyin.");
            }else {
                System.out.println("Şifre başarıyla oluşturuldu.");
            }


        }
    }}