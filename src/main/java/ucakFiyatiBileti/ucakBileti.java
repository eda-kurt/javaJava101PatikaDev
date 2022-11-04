package ucakFiyatiBileti;

import com.sun.jdi.event.BreakpointEvent;

import java.text.BreakIterator;
import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {

        double mesafe,age,yolculukTipi,toplamFiyat,indirim = 0,sonTutar,sonIndirim;
        Scanner input = new Scanner(System.in);

        System.out.println("Yasiniz ? : ");
        age=input.nextInt();
        System.out.println("Gidilecek km ? : ");
        mesafe=input.nextInt();
        System.out.println("Yolculuk tipini seciniz:\n1-Tek Yon\n2-Gidis-Donus");
        yolculukTipi=input.nextInt();

       double mesafeBasiUcret=0.10;

       if(mesafe>0 && age >0 && (yolculukTipi==1 || yolculukTipi== 2))
       {
           System.out.println("Basarili Giris ! ");

           toplamFiyat=mesafe*mesafeBasiUcret;
           System.out.println(toplamFiyat+": toplam fiyat");

           if(age<=12){
               indirim=toplamFiyat-(toplamFiyat/2);
               System.out.println(" 12 yas alti Indirimli fiyati : "+ indirim);
           } else if (age > 12 && age < 24) {
               indirim=toplamFiyat-(toplamFiyat*10/100);
               System.out.println("12-24 yas arasi indirimli fiyati : " + indirim);
           } else if (age > 65) {
               indirim=toplamFiyat-(toplamFiyat*30/100);
               System.out.println("65 yas ustu indirimli fiyat : " + indirim);
           }



           if(yolculukTipi==2 && indirim !=0){
               sonTutar=indirim-(indirim*20/100);
               System.out.println("Gidis-Donus Son Fiyat : " + sonTutar*2);
           }
       }
         else {
           System.out.println("Hatali Veri Girdiniz ! ");

         }

    }




    }


