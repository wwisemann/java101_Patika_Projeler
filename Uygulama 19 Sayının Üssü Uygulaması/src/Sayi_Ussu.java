import java.util.Scanner;

public class Sayi_Ussu {
    public static void main(String[] args) {

        // Değişkenler
        int number;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = inp.nextInt();

        // İşlemler
        System.out.println("\n***************************************\n");
        for (int i = 1; i <= number; i*=4){
            System.out.println(i);
        }
        System.out.println("\n***************************************\n");
        for (int i = 1; i <= number; i*=5){
            System.out.println(i);
        }
    }
}
