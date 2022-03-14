import java.util.Scanner;

public class Harmonik_Seri {
    public static void main(String[] args) {

        // Değişkenler
        double number,divisor=1;
        double result = 0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        // İşlemler
        for (int i = 1; i <= number; i++){
            result += 1 / divisor;
            divisor++;
        }
        System.out.print("Harmonik serinin sonucu: " + result);
    }
}
