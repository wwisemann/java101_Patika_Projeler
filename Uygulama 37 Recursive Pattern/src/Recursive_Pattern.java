import java.util.Scanner;

public class Recursive_Pattern {

    static int pattern_minus(int number,int number2) {
        if (number <= 0){
            System.out.print("\t"+number);
            number2 = number;
            return number2;
        }else {
            System.out.print("\t"+number);
            return pattern_minus(number - 5,number2);
        }
    }

    static int pattern_plus(int number,int number3){
        if (number3 >= number){
            System.out.print("\t"+number3);
            return 1;
        }else {
            if (number3 <= 0){
                return pattern_plus(number,number3 + 5);
            }else {
                System.out.print("\t" + number3);
                return pattern_plus(number, number3 + 5);
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int number2 = 0;
        int number3 = pattern_minus(number,number2);

        pattern_plus(number,number3);

    }
}
