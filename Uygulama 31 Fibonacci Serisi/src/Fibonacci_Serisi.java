import java.util.Scanner;

public class Fibonacci_Serisi {
    public static void main(String[] args) {

        // Değişkenler
        int num1 = 0,num2 = 1,num3,total;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Serinin eleman sayısını giriniz: ");
        total = inp.nextInt();

        // İşlemler
        System.out.println(num1 + "\n" + num2);
        for (int i = 2; i <= total; i++){
            num3 = num1+num2;
            System.out.println(num3);
            num1 = num2;
            num2 = num3;
        }
    }
}
// 0 1 1 2 3 5 8 13 21 34