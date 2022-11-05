package tekSayiDongu;

import java.util.Scanner;

public class tekSayiDongu {

    public static void main(String[] args) {
        int sayi, i=0, sum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Sayi Giriniz : ");
        sayi = input.nextInt();

        for (i=0;sayi>=0;i++){

            System.out.println("Sayi Giriniz : ");
            sayi = input.nextInt();

            if (sayi%2==1){
                System.out.println("Tek sayi Girdiniz!\nProgram Durduruldu! ");
                break;
            }

            else {
                if (sayi%2==0 && sayi%4==0) {
                    sum=sayi+sum;
            }

            }

        }
        System.out.println("\n\nCift ve 4' un katlari olan sayilarin toplami :" + sum);


    }
}

