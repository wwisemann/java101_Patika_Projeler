import java.sql.SQLOutput;
import java.util.Scanner;

public class hipotenus_Bulma {
    public static void main(String[] args) {
        // Değişkenler
        double hipotenus,kenar_Bir, kenar_Iki;

        // Veri Alma
        Scanner input = new Scanner(System.in);

        System.out.print("İlk Dik Kenar Uzunluğunu Giriniz: ");
        kenar_Bir = input.nextDouble();
        System.out.print("İkinci Dik Kenar Uzunluğunu Giriniz: ");
        kenar_Iki = input.nextDouble();

        // İşlem
        hipotenus = Math.sqrt((kenar_Bir*kenar_Bir)+(kenar_Iki*kenar_Iki));
        System.out.println("Hipotenüs: " + hipotenus);

           /* ************************* Ödev Kısmı ********************************* */

        // Değişkenler
        int a,b,c;
        double alan,u,sonuc;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.println("Birinci Kenar: ");
        a = inp.nextInt();
        System.out.println("İkinci Kenar: ");
        b = inp.nextInt();
        System.out.println("Üçüncü Kenar: ");
        c = inp.nextInt();

        // İşlemler
        u = (a+b+c)/2;
        alan = u * ((u-a)+(u-b)+(u-c));
        sonuc = Math.sqrt(alan);
        System.out.println("Cevre: " + 2*u + "\nAlan: " + sonuc);


    }
}
