import java.util.Scanner;

public class Etkinlik_Onerme {
    public static void main(String[] args) {
        //Değişkenler
        int heat;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.println("Sıcaklık Değeri Giriniz: ");
        heat = inp.nextByte();

        if (heat < 5){
            System.out.println("Kayak Yapabilirsiniz.");
        }else if(heat>=5 && heat<=15){
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if(heat>15 && heat <=25){
            System.out.println("Piknik Yapabilirsiniz.");
        }else if(heat>25){
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
