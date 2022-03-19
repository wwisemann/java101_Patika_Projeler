import java.util.Scanner;

public class Palindrom_Sayilar {
    static boolean isPalindrom(int number){
        int temp = number, reverseNumber = 0, lastNumber;
        while(temp != 0){
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }

        if (reverseNumber == number){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = inp.nextInt();
        isPalindrom(number);

        boolean palindrom = isPalindrom(number);

        if (palindrom){
            System.out.println(number + " Palindrom bir sayıdır.");
        }else{
            System.out.println(number + " Palindrom bir sayı değildir.");
        }

    }
}




// bölü 10 = son sayıyı siler - %10 son sayıyı alır.