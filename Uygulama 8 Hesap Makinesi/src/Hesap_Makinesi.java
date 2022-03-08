import java.util.Scanner;

public class Hesap_Makinesi {
    public static void main(String[] args) {
        // Değişkenler
        double number1,number2;
        int select;

        // Veri Alma
        System.out.println("Lütfen işlem yapmak istediğini sayıları giriniz: ");
        Scanner inp = new Scanner(System.in);
        number1 = inp.nextDouble();
        number2 = inp.nextDouble();
        System.out.println("Seçtiğiniz sayılar ---> " + number1 + " " + number2);


        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz." + "\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println(number1 + number2);
                break;
            case 2:
                System.out.println(number1 - number2);
                break;
            case 3:
                System.out.println(number1 * number2);
                break;
            case 4:
                System.out.println(number1 / number2);
                break;
            default:
                System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
