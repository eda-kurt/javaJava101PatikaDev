package maxMinDegerBulma;

import java.util.*;

public class MaxMin {

    public static void main(String[] args) {
        int girilenSayi,maxDeger,deger, i;
        Scanner input =new Scanner(System.in);

        int[] girilenDegerler=new int[4];

        for ( i = 0; i <=3; i++) {
            System.out.println("Sayi Giriniz : ");
            girilenSayi=input.nextInt();

            girilenDegerler[i]=girilenSayi;
        }
        System.out.println("En kucuk Sayi : "+ Arrays.stream(girilenDegerler).min());
        System.out.println("En buyuk Sayi : "+ Arrays.stream(girilenDegerler).max());



        }
    }

