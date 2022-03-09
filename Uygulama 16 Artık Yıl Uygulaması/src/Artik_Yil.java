import java.util.Scanner;

public class Artik_Yil {
    public static void main(String[] args) {
        // Değişkenler
        int year;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        year = inp.nextInt();

        // İşlemler
        if (year%4 == 0){
            System.out.println("Bu bir artık yıldır.");
        }else{
            System.out.println("Bu bir artık yıl değildir.");
        }
    }
}
