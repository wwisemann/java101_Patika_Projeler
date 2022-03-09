import java.sql.SQLOutput;
import java.util.Scanner;

public class Sinif_Gecme_Durum {
    public static void main(String[] args) {
        // Değişkenler
        int mat,fizik,turkce,kimya,muzik,bolen = 5,toplam;
        int gecme_Notu = 55;
        double ortalama;

        // Veri Alma
        Scanner inp = new Scanner(System.in);

        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();
        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();
        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();
        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();
        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik= inp.nextInt();

        toplam = mat+muzik+kimya+fizik+turkce;

        // İşlemler
        
        if (mat > 100 || mat < 0){
            toplam = toplam - mat;
            bolen--;
        }
        if (turkce > 100 || turkce < 0){
            toplam = toplam - turkce;
            bolen--;
        }
        if (fizik > 100 || fizik < 0){
            toplam = toplam - fizik;
            bolen--;
        }
        if (kimya > 100 || kimya < 0){
            toplam = toplam - kimya;
            bolen--;
        }
        if (muzik > 100 || muzik < 0){
            toplam = toplam - muzik;
            bolen--;
        }

        System.out.println("Sınıftan geçme notunuz hesaplanıyor....");
        ortalama = toplam / bolen;

        if (ortalama<55){
            System.out.println("Kaldınız.");
        }else {
            System.out.println("Geçtiniz.");
        }

        System.out.println("Ortalamanız: " + ortalama);

    }
}
