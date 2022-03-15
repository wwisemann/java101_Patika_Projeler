import java.util.Scanner;

public class Sayi_Siralama_Iki {
    public static void main(String[] args) {

        // Değişkenler
        int total,number,min=0,max=0;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz: ");
        total = inp.nextInt();

        // İşlemler
        if (total == 0){
            System.out.println("İşlem yapılmıyor. İyi günler !");
        }

        for (int i = 1; i <= total; i++){
            System.out.print(i + ".Sayıyı Giriniz: ");
            number = inp.nextInt();
            if (number > max){
                if(min == 0) {
                    min = number;
                }
                max = number;
            }
            if (number < min) {

                min = number;
            }
        }

        System.out.println("Sayılardan en büyüğü: " + max);
        System.out.println("Sayılardan en küçüğü: " + min);
    }
}
