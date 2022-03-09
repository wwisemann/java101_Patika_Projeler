import java.util.Scanner;

public class Cin_Zodyagi {
    public static void main(String[] args) {
        // Değişkenler
        int birthday,zodiac;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğum Yılınız: ");
        birthday = inp.nextInt();

        // İşlemler
        zodiac = birthday%12;

        if (zodiac == 0){
            System.out.println("Maymunsunuz.");
        }else if (zodiac == 1){
            System.out.println("Horozsunuz.");
        }else if (zodiac == 2){
            System.out.println("Köpeksiniz.");
        }else if (zodiac == 3){
            System.out.println("Domuzsunuz.");
        }else if (zodiac == 4){
            System.out.println("Faresiniz.");
        }else if (zodiac == 5){
            System.out.println("Öküzsünüz.");
        }else if (zodiac == 6){
            System.out.println("Kaplansınız.");
        }else if (zodiac == 7){
            System.out.println("Tavşansınız.");
        }else if (zodiac == 8){
            System.out.println("Ejderhasınız.");
        }else if (zodiac == 9){
            System.out.println("Yılansınız.");
        }else if (zodiac == 10){
            System.out.println("Atsınız.");
        }else if (zodiac == 11){
            System.out.println("Koyunsunuz.");
        }
    }
}
