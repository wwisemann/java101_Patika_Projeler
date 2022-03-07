import java.util.Scanner;

public class Not_Uygulamasi {
    public static void main(String[] args) {
        // Değişkenler
        int mat,kimya,tarih,muzik,turkce,fizik;
        double ortalama_Not;

        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan Veri Alma
        System.out.println("Matematik Notunuzu Giriniz: ");
        mat = inp.nextInt();

        System.out.println("Kimya Notunuzu Giriniz: ");
        kimya = inp.nextInt();

        System.out.println("Tarih Notunuzu Giriniz: ");
        tarih = inp.nextInt();

        System.out.println("Müzik Notunuzu Giriniz: ");
        muzik = inp.nextInt();

        System.out.println("Türkçe Notunuzu Giriniz: ");
        turkce = inp.nextInt();

        System.out.println("Fizik Notunuzu Giriniz: ");
        fizik = inp.nextInt();


        //Ortalamayı Hesaplama
        ortalama_Not = (mat+kimya+tarih+muzik+turkce+fizik) / 6;
        System.out.println("Ortalama Notunuz: " + ortalama_Not + "\tTebrikler");

        //Sınıfı Geçme Ve Kalma Durumları
        String durum;
        durum = (ortalama_Not<60) ? "Kaldınız" : "Geçtiniz";
        System.out.println("Ortalama: " + ortalama_Not + "\t" + durum);

    }
}
