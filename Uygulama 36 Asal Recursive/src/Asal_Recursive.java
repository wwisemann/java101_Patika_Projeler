import java.util.Scanner;

public class Asal_Recursive {

    static int isPrime(int i,int number){

        if (number == i){
            return 0;
        }else if(number % i == 0){
            return 1;
        }else{
            return isPrime(i+1,number);
        }

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();

        if (isPrime(2,number) == 0){
            System.out.println(number + " Asaldır");
        }else{
            System.out.println(number + " Asal değildir.");
        }

    }
}
