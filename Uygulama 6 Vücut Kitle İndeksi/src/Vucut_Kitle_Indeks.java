import java.util.Scanner;

public class Vucut_Kitle_Indeks {
    public static void main(String[] args) {
        // Değişkenler
        double kilo,boy,indeks;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen Kilonuzu (KG) Giriniz: ");
        kilo = inp.nextDouble();
        System.out.print("Lütfen Boyunuzu (Metre) Giriniz: ");
        boy = inp.nextDouble();

        // İşlemler
        indeks = kilo / (boy*boy);

        // Sonuç
        System.out.println("Kilonuz: " + kilo);
        System.out.println("Boyunuz: " + boy);
        System.out.println("Vücut Kitle İndeksiniz: " + indeks);
    }
}
