import java.util.Scanner;

public class Cift_Sayi_Toplam {
    public static void main(String[] args) {
        // Değişkenler
        int number,a=0,counter=0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        // İşlemler
        for (int i = 1; i<=number; i++) {
            if ((i % 3 == 0) && (i % 4 ==0)){
                a = a + i;
                counter++;
            }
        }
        System.out.println("Girdiğiniz sayıya kadar olan sayıların 3 ve 4'e bölünenlerin ortalaması: " + a/counter);
    }
}
