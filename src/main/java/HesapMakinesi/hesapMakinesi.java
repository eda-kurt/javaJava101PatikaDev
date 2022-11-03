package HesapMakinesi;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        double deger1,deger2,yapilacakIslem,sonuc;

        Scanner input=new Scanner(System.in);

        System.out.println("Hesap yapmak icin deger giriniz : ");
        deger1=input.nextDouble();

        System.out.println( deger1 + " ile islem yapilacak degeri giriniz : ");
        deger2=input.nextDouble();


        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");

        System.out.println("Yapmak istediginiz islemi giriniz : ");
        yapilacakIslem=input.nextDouble();

        if(yapilacakIslem==1){
           sonuc= deger1+deger2;
            System.out.println("toplama islemi sonucu : "+ sonuc);
        }
        else if (yapilacakIslem==2) {
            sonuc=deger1-deger2;
            System.out.println("Cikarma islemi sonucu : "+ sonuc);
        }
        else if (yapilacakIslem==3) {
                sonuc=deger1*deger2;
                System.out.println("Carpma islemi sonucu : "+ sonuc);
        }
        else if (yapilacakIslem==4) {
            sonuc=deger1/deger2;
            System.out.println("Bolme islemi sonucu : "+ sonuc);
        }
        else {
            System.out.println(" Yapilacak islem bulunamadi.  ");
        }
}
}
