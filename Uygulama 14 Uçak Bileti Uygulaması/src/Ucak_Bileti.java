import java.util.Scanner;

public class Ucak_Bileti {
    public static void main(String[] args) {
        // Değişkenler
        int age,km,road_type,departure,round_trip;
        double total_price;
        double km_tl = 0.10;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi KM türünden giriniz: ");
        km = inp.nextInt();
        System.out.print("Yaşınız: ");
        age = inp.nextInt();
        System.out.println("Yolculuk Tipiniz --> 1-Gidiş 2-Gidiş/Dönüş");
        road_type = inp.nextInt();

        if (km<0 || age<0 || (road_type != 1 & road_type != 2)){
            System.out.println("Hatalı Veri Girdiniz !");
        }else{
            System.out.println("Bilgileriniz Alınmıştır.");
        }

        // İşlemler
        total_price = km_tl * km;

        if (road_type == 1){
            if (age < 12){
                total_price = total_price-(total_price/2);
            }else if (age>=12 && age<24){
                total_price = total_price-(total_price/10);
            }else if (age>65){
                total_price = total_price-(total_price*3/10);
            }
        }else if(road_type == 2){
            total_price = total_price-(total_price*2/10);
            if (age < 12){
                total_price = total_price-(total_price/2);
            }else if (age>=12 && age<24){
                total_price = total_price-(total_price/10);
            }else if (age>65){
                total_price = total_price-(total_price*3/10);
            }
        }

        System.out.println("Bilet Ücretiniz: " + total_price);
    }
}
