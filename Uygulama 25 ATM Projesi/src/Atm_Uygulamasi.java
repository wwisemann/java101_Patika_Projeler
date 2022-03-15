import java.util.Scanner;

public class Atm_Uygulamasi {
    public static void main(String[] args) {

        // Değişkenler
        String userName, password;
        int price,select,right = 3,balance = 1500;


        // Veri Alma - İşlemler
        Scanner inp = new Scanner(System.in);
        while(right > 0) {
            System.out.print("Kullanıcı Adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            password = inp.nextLine();

            if (userName.equals("wisemann") && password.equals("123")){
                System.out.println("Giriş Başarılı !\n");
                 do {
                    System.out.println("1-Para Yatırma\n2-Para Çekme\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Lütfen Yapacağınız İşlemi Seçiniz: ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Paranız: " + balance + " Lütfen yatıracağınız miktarı giriniz: ");
                            price = inp.nextInt();
                            balance += price;
                            System.out.println("Hesabınızdaki toplam bakiye güncellenmiştir ---> " + balance);
                            break;
                        case 2:
                            System.out.println("Paranız: " + balance + " Lütfen çekeceğiniz miktarı giriniz: ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz !");
                            } else {
                                balance -= price;
                                System.out.println(price + "Tl çekilmiştir. Kalan bakiyeniz: " + balance);
                            }
                            break;
                        case 3:
                            System.out.println("Toplam Bakiyeniz: " + balance);
                            break;
                        case 4:
                            System.out.println("Çıkış Yapılıyor. İyi günler !");
                            break;
                    }
                }while(select != 4);
                 break;
            }else {
                right--;
                System.out.println("Hatalı Giriş Yaptınız !");
                if (right == 0){
                    System.out.println("3 kez hatalı giriş yaptınız. Hesabınız bloke ediliyor.");
                }else{
                    System.out.println("Kalan Hakkınız: " + right);
                }
            }// 1.If-Else parantez
        }//While parantez
        
    }
}
