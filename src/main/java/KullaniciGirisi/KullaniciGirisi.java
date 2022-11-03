package KullaniciGirisi;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String kullaniciAdi,kullaniciAdi1;
        int password,password2,password3;

        kullaniciAdi="edakurt1";
        password=1234;
        System.out.println(kullaniciAdi+ "-" +password);

        Scanner input=new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz : ");
        kullaniciAdi1=input.next();
        System.out.println(kullaniciAdi1);

        System.out.println("Sifrenizi giriniz : ");
        password2=input.nextInt();
        System.out.println(password2);

        if (kullaniciAdi1.equals(kullaniciAdi)){
           if (password==password2)
            System.out.println("Basariyla Giris Yaptiniz.");
               else {
               System.out.println("Sifreniz yanlistir.Sifirlamak istiyorsaniz 1\nIstemiyorsaniz 2 giriniz.");
               int evetHayir=input.nextInt();

               switch (evetHayir){
                   case 1:
                       System.out.println("Yeni sifre giriniz : ");
                       password3=input.nextInt();

                       if (password==password3){
                           System.out.println(" Sifre olusturulamadi.Lutfen baska sifre giriniz. ");
                       }
                       else {
                           System.out.println(" Yeni sifreniz olusturuldu. ");
                       }



               }
           }
        }
          else {
            System.out.println("Kullanici adiniz veya sifre yanlistir.");
        }


    }
}
