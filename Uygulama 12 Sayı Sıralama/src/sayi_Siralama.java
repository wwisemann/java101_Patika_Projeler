import java.util.Scanner;

public class sayi_Siralama {
    public static void main(String[] args) {
        // Değişkenler
        int a,b,c;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("1.Sayıyı Giriniz --> A=");
        a = inp.nextInt();
        System.out.print("2.Sayıyı Giriniz --> B=");
        b = inp.nextInt();
        System.out.print("3.Sayıyı Giriniz --> C=");
        c = inp.nextInt();

        // İşlem

        if (a>b && a>c){
            System.out.print("A");
            if (b>c){
                System.out.print(",B,C");
            }else if (c>b){
                System.out.print(",C,B");
            }
        }else if(b>a && b>c){
            System.out.print("B");
            if (c>a){
                System.out.print(",C,A");
            }else if (a>c){
                System.out.print(",A,C");
            }
        }else if(c>a && c>b){
            System.out.print("C");
            if (a>b){
                System.out.print(",A,B");
            }else if (b>a){
                System.out.print(",B,A");
            }
        }
    }
}
