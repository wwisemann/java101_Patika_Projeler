import java.util.Scanner;

public class Kombinasyon_Uygulamasi {
    public static void main(String[] args) {

        // Değişkenler
        int n,r,fark,result,total_One=1,total_Two=1,total_Three=1;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.println("C(n,r) Şeklinde hesaplamak istediğiniz kombinasyonu giriniz.");
        System.out.print("n:");
        n = inp.nextInt();
        System.out.print("r:");
        r = inp.nextInt();

        // İşlemler
        /* n'nin faktoriyel hesabı */
        for (int i = 1; i <= n; i++){
            total_One = total_One * i;
        }
        /* r'nin faktoriyel hesabı */
        for (int i = 1; i <= r; i++){
            total_Two = total_Two * i;
        }
        /* n-r'nin faktoriyel hesabı */
        fark = n - r;
        for (int i = 1; i <= fark; i++){
            total_Three = total_Three * i;
        }
        result = total_One / (total_Two * total_Three);
        System.out.print("Kombinasyon işleminin sonucu: " + result);
    }
}
