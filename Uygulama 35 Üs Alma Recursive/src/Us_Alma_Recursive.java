import java.util.Scanner;

public class Us_Alma_Recursive {

    static int f(int base,int exponent){
        if (exponent == 0){
            return 1;
        }
        return base * f(base,exponent-1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban giriniz: ");
        int base = inp.nextInt();
        System.out.print("Üs giriniz: ");
        int exponent = inp.nextInt();
        System.out.println(f(base,exponent));
    }
}
