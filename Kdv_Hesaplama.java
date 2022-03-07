import java.util.Scanner;

public class Kdv_Hesaplama {
    public static void main(String[] args) {
        // Değişkenler
        double kdvsiz_Tutar, kdvli_Tutar;
        double kdv = 0.18;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.println("KDV'siz Tutarı Giriniz: ");
        kdvsiz_Tutar = inp.nextDouble();
        System.out.println("KDV'siz Tutar: " + kdvsiz_Tutar);

        // İşlemler
        kdvli_Tutar = (kdvsiz_Tutar * kdv) + kdvsiz_Tutar;

        double kdv_Tutari = kdvli_Tutar - kdvsiz_Tutar;
        // Sonuç
        System.out.println("KDV'li Tutar: " + kdvli_Tutar);
        System.out.println("KDV Tutarı: " + kdv_Tutari);

        // Ödev Kısmı
        if (kdvsiz_Tutar < 1000) {
            kdv = 18;
            //Diğer işlemler aynı.
        } else {
            kdv = 8;
            //Diğer işlemler aynı.
        }
    }
}
