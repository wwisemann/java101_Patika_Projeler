import java.util.Scanner;

public class Burc_Bulma {
    public static void main(String[] args) {
        // Değişkenler
        int month,day;

        // Veri Alma
        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay(Numara): ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz Gün: ");
        day = inp.nextInt();

        // İşlemler
        if (month == 1){
            if(day<22){
                System.out.println("Oğlak Burcusunuz.");
            }else if(day>21){
                System.out.println("Kova Burcusunuz.");
            }
        }else if(month == 2){
            if(day<20){
                System.out.println("Kova Burcusunuz.");
            }else if(day>19){
                System.out.println("Balık Burcusunuz.");
            }
        }else if(month == 3){
            if (day<20){
                System.out.println("Balık Burcusunuz.");
            }else if (day>19){
                System.out.println("Koç Burcusunuz.");
            }
        }else if (month == 4){
            if (day<21){
                System.out.println("Koç Burcusunuz.");
            }else if (day>20){
                System.out.println("Boğa Burcusunuz.");
            }
        }else if (month == 5){
            if (day<22){
                System.out.println("Boğa Burcusunuz.");
            }else if (day>21){
                System.out.println("İkizler Burcusunuz.");
            }
        }else if (month == 6){
            if (day<23){
                System.out.println("İkizler Burcusunuz.");
            }else if (day>22){
                System.out.println("Yengeç Burcusunuz.");
            }
        }else if (month == 7){
            if (day<23){
                System.out.println("Yengeç Burcusunuz.");
            }else if (day>22){
                System.out.println("Aslan Burcusunuz.");
            }
        }else if (month == 8){
            if (day<23){
                System.out.println("Aslan Burcusunuz.");
            }else if (day>22){
                System.out.println("Başak Burcusunuz.");
            }
        }else if (month == 9){
            if (day<23){
                System.out.println("Başak Burcusunuz.");
            }else if (day>22){
                System.out.println("Terazi Burcusunuz.");
            }
        }else if (month == 10){
            if (day<23){
                System.out.println("Terazi Burcusunuz.");
            }else if (day>22){
                System.out.println("Akrep Burcusunuz.");
            }
        }else if (month == 11){
            if (day<22){
                System.out.println("Akrep Burcusunuz.");
            }else if (day>21){
                System.out.println("Yay Burcusunuz.");
            }
        }else if (month == 12){
            if (day<22){
                System.out.println("Yay Burcusunuz.");
            }else if (day<21){
                System.out.println("Oğlak Burcusunuz.");
            }
        }
    }
}
