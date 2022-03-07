import java.util.Scanner;

public class Manav_Uygulamasi {
    public static void main(String[] args) {
        // Değişkenler
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5, toplam_tutar;
        double armut_tane, elma_tane, domates_tane, muz_tane, patlican_tane;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.println("Alacağınız Armut Miktarı(KG): ");
        armut_tane = inp.nextDouble();
        System.out.println("Alacağınız Elma Miktarı(KG): ");
        elma_tane = inp.nextDouble();
        System.out.println("Alacağınız Domates Miktarı(KG): ");
        domates_tane = inp.nextDouble();
        System.out.println("Alacağınız Muz Miktarı(KG): ");
        muz_tane = inp.nextDouble();
        System.out.println("Alacağınız Patlıcan Miktarı(KG): ");
        patlican_tane = inp.nextDouble();

        // İşlemler
        toplam_tutar = (armut * armut_tane) + (elma * elma_tane) + (domates * domates_tane) + (muz * muz_tane) + (patlican* patlican_tane);
        System.out.println("Toplam Ödenecek Tutar: " + toplam_tutar + "TL");
    }
}
