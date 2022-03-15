import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {

        // Değişkenler
        int ebob=1,ekok,n1,n2,a=1;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = inp.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = inp.nextInt();

        // İşlemler
        while (a <= ((n1>n2) ? n1:n2)){
            if (n1 % a == 0 && n2 % a == 0) {
                ebob = a;
            }
            a++;
        }
        ekok = (n1*n2)/ebob;
        System.out.println(n1 + " ve " + n2 + "\n1-Ebobları: " + ebob + "\n2-Ekokları: " + ekok);

    }
}
