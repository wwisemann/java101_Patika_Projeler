import java.util.Scanner;

public class Tek_Sayi_Toplam {
    public static void main(String[] args) {
        
        // Değişkenler
        int number,a=0,counter=0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);

        // İşlemler
        do{
            System.out.print("Lütfen çift sayı giriniz: ");
            number = inp.nextInt();
            if (number % 4 == 0){
                a = a + number;
                counter++;
            }
        }while(number % 2 == 0);

        System.out.println("Girdiğiniz çift ve 4'ün katı sayıların ortalaması: " + a/counter);
    }
}
