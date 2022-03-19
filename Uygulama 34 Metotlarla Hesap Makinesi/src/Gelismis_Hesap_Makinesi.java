import java.util.Scanner;

public class Gelismis_Hesap_Makinesi {
    static void plus(){
       Scanner inp = new Scanner(System.in);
       int number, result = 0, i = 1;
       while(true){
           System.out.print(i++ +".Sayı: ");
           number = inp.nextInt();
           if (number == 0){
               break;
           }
           result = result + number;
       }
        System.out.println("Sonuç: " + result);
    }

    static void minus(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz: ");
        int counter = inp.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++){
            System.out.print(i + ".Sayı: ");
            number = inp.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void times(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = inp.nextInt();
        int number, result = 1;
        for (int i = 1; i <= counter; i++){
            System.out.print(i + ".Sayı: ");
            number = inp.nextInt();
            if (number == 1){
                break;
            }
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divided(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        int counter = inp.nextInt();
        double number, result = 0.0;
        for (int i = 1; i <= counter; i++){
            System.out.print(i + ".Sayı: ");
            number = inp.nextDouble();
            if (i != 1 && number == 0){
                System.out.println("Hatalı Giriş !");
                break;
            }
            if (i == 1){
                result += number;
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Tabanı giriniz: ");
        int base = inp.nextInt();
        System.out.print("Üssü giriniz: ");
        int exponent = inp.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= number; i++){
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Modu alınacak sayı: ");
        int number = inp.nextInt();
        System.out.print("Mod: ");
        int mod = inp.nextInt();
        int result = 0;
        result = number % mod;
        System.out.println("Sonuç: " + result);
    }

    static void area(){
        Scanner inp = new Scanner(System.in);
        System.out.print("Uzun Kenar: ");
        int long_Side = inp.nextInt();
        System.out.print("Kısa Kenar: ");
        int short_Side = inp.nextInt();
        int area,perimeter;
        if (long_Side == short_Side){
            System.out.println("Bu bir kare ahmak !");
        }
        area = long_Side*short_Side;
        perimeter = (long_Side*2)+(short_Side*2);
        System.out.println("Çevre: " + perimeter + "\nAlan: " + area);
    }


    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int select;
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        do {
            System.out.println(menu);
            System.out.print("Lütfen yapacağınız işlemi seçiniz: ");
            select = inp.nextInt();

            switch (select){
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    area();
                    break;
                case 0:
                    System.out.println("İyi günler !");
                    break;
                default:
                    System.out.println("Yanlış bir tuşlama yaptınız !");
            }
        }while (select != 0);
    }
}
