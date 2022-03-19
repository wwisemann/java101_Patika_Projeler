import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Fibonacci {
    static int f(int number){
        if(number == 1 || number == 2 ){
            return 1;
        }
        return f(number-1) + f(number-2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();
        System.out.println(f(number));

    }
}


// 0 1 1 2 3 5 8 13 21 34