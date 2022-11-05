package Com.Albessa;

import java.util.Scanner;

public class albessa {
    public static void main(String[] args) {

        double productCode,productPrice,arama,productPrice1,arama2,productCode1,eklenecekUrun = 0,productPrice2;

        productCode=1950;
        productPrice1=1.299;
        productCode1=eklenecekUrun;

        Scanner input=new Scanner(System.in);
        System.out.println("Urun Kayit edecekseniz 1 \nUrun Fiyati arayacaksaniz 2 Giriniz : ");
        arama=input.nextDouble();


        if (arama==1){
            System.out.println("Kayit edilecek Urun kodu Giriniz : ");
            productCode1=input.nextDouble();
            System.out.println("Urunun fiyatini Giriniz : ");
            productPrice2=input.nextDouble();
            System.out.println("Girilen Kod ve urun fiyati : "+productCode1+"-"+productPrice2 );



        }
        else if (arama==2) {
            System.out.println("Aranacak urun kodunu Giriniz :");
            arama2=input.nextDouble();
              if (arama2==productCode) {
            System.out.println("Urunun Fiyati :" + productPrice1);

        }
                   else {
                System.out.println("Urun Bulunamadi.");
            }
        }

        else {
            System.out.println("Hatali Veri Girisi !");
        }


    }
}
