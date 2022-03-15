import java.util.Scanner;

public class Mukemmel_Sayi {
    public static void main(String[] args) {

        // Değişkenler
        int number,total=0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        // İşlemler
        for (int i = 1; i <= number/2; i++){
            if(number%i == 0){
                total += i;
            }
        }

        if (total == number){
            System.out.println(number + " Mükemmel bir sayıdır.");
        }else {
            System.out.println(number + " Mükemmel bir sayı değildir.");
        }
    }
}
