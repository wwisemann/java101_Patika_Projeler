import java.util.Scanner;

public class Basamaklarin_Toplami {
    public static void main(String[] args) {

        // Değişkenler
        int number,number_two,result=0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        number = inp.nextInt();

        // İşlemler
        while(number != 0){
            number_two = number % 10;
            result = result + number_two;
            number = number / 10;
        }
        System.out.print("Basamakların Toplamı: " + result);
    }
}
