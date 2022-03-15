import java.util.Scanner;

public class Ters_Ucgen {
    public static void main(String[] args) {

        // Değişkenler
        int a;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        a = inp.nextInt();

        // İşlemler
        for (int i = 0; i <= a; i++) {

            for (int j = 0; j <= (i+1) ; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2*(a-i)); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}