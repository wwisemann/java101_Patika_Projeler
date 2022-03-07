import java.util.Scanner;

public class Daire_Alan_Cevre_Bulma {
    public static void main(String[] args) {
        // Değişkenler
        double pi = 3.14, cevre , alan , daire_dilim;
        int r,a;

        // Veri Alma
        System.out.println("Yarıçapı Giriniz: ");
        Scanner inp = new Scanner(System.in);
        r = inp.nextInt();
        System.out.println("Merkez Açısının Ölçüsünü Giriniz: ");
        a = inp.nextInt();

        // İşlemler
        cevre = 2 * pi * r;
        alan = pi * r * r;
        daire_dilim = (pi * (r*r) * a) / 360;
        System.out.println("Alan = " + alan + "\nÇevre = " + cevre + "\nDaire Diliminin Alanı = " + daire_dilim );




    }
}
