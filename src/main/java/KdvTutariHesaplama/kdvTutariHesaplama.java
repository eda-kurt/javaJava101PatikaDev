package KdvTutariHesaplama;

import java.util.Scanner;

public class kdvTutariHesaplama {
    public static void main(String[] args) {
        double paraDegeri,kdvliFiyat,kdvTutar,KdvTutar;

        Scanner input= new Scanner(System.in);
        System.out.println("Para Degerinizi Giriniz : ");
        paraDegeri=input.nextInt();

        kdvTutar=0.18;

        double a = kdvliFiyat=(paraDegeri*kdvTutar)+paraDegeri;

        KdvTutar=0.08;
        double b=kdvliFiyat=(paraDegeri*KdvTutar)+paraDegeri;



        boolean girilenTutar= paraDegeri<=1000;
        double str = girilenTutar ? a : b;

        System.out.println("KDV'li Fiyatiniz : " + str );








    }
}
