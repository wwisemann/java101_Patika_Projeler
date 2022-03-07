import java.util.Scanner;

public class Taksimetre_Uygulamasi {
    public static void main(String[] args) {
        // Değişkenler
        int gidilecek_mesafe;
        int acilis_ucreti = 10;
        int minimum_tutar = 20;
        double km_ucret = 2.2, total_ucret;

        // Veri Alma
        System.out.print("Gidilecek Mesafeyi Yazınız: ");
        Scanner inp = new Scanner(System.in);
        gidilecek_mesafe = inp.nextInt();

        // İşlemler
        total_ucret = (gidilecek_mesafe * km_ucret) + acilis_ucreti;

        if(total_ucret < 20){
            total_ucret = 20;
            System.out.println("Ödenecek Tutar: " + total_ucret);
        }
        else{
            System.out.println("Ödenecek Tutar: " + total_ucret);
        }
    }
}
