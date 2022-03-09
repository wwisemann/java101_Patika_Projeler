import java.sql.SQLOutput;
import java.util.Scanner;

public class kullanici_Girisi {
    public static void main(String[] args) {
        // Değişkenler
        String username,password,password_two;
        int select;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanıcı Adınız: ");
        username = inp.nextLine();

        System.out.println("Şifreniz: ");
        password = inp.nextLine();

        // İşlemler
        if (username.equals("wisemann") && password.equals("123")) {
            System.out.println("Giriş Başarılı !");
        }
        else {
            System.out.println("Hatalı Kullanıcı Adı Veya Şifre !");
            System.out.println("Şifrenizi Sıfırlamak İsterseniz Lütfen Tuşlayınız. 1-Evet 2-Hayır");
            select = inp.nextInt();

            switch (select) {
                case 1:
                    System.out.println("Şifreniz Eski Şifrenizle Veya Hatalı Girdiğiniz Şifre İle Aynı Olamaz !");
                    System.out.println("Yeni Şifrenizi Giriniz: ");
                    password_two = input.nextLine();

                    if (password_two.equals(password)){
                        System.out.println("Şifre Oluşturulamadı. Lütfen Başka Şifre Giriniz.");
                    }else{
                        System.out.println("Şifreniz Başarıyla Oluşturuldu.");
                    }
                    break;
                case 2:
                    System.out.println("Şifreniz Değiştirilmedi İyi Günler!");
                    break;
            }
        }


    }
}
