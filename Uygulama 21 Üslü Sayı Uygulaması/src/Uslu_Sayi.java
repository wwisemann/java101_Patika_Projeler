import java.util.Scanner;

public class Uslu_Sayi {
    public static void main(String[] args) {

        // Değişkenler
        int number,exponent,result=1;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        number = inp.nextInt();
        System.out.print("Üs: ");
        exponent = inp.nextInt();

        // İşlemler
        for (int i = 1; i <= exponent; i++){
            result *= number;
        }
        System.out.print("Sonuç: " + result);
    }
}
