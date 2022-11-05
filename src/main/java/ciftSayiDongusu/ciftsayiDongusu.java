package ciftSayiDongusu;

import java.util.Scanner;

public class ciftsayiDongusu {
    public static void main(String[] args) {
        int sayi,i,toplam,count=0,sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayi giriniz : ");
        sayi=input.nextInt();

        System.out.println(sayi+" kadar cift sayilar :");
   for (i=0;i<=sayi;i++){
            if (i%2==0){
                System.out.println(i );
            }
        }

        System.out.println(sayi +" kadar 3 ve 4 un katlari olan sayilar : ");
        for (i=0;i<=sayi;i++){

            if ((i%3==0) && (i%4==0)) {
                System.out.println(i);
                count=count+1;
                sum=sum+i;

           }

        }
        System.out.println(count+"  Tane Deger Donduruldu.");
        System.out.println(sum+ " Degerlerin Toplami Donduruldu. ");
        System.out.println("Bu sayilarin ortalamasi : "+ sum/count);
    }
}
