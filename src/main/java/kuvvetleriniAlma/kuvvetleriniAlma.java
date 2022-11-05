package kuvvetleriniAlma;

import java.util.Scanner;

public class kuvvetleriniAlma {
    public static void main(String[] args) {
        double sayi,us=0,i,k = 02;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayiyi giriniz : ");
        sayi=input.nextInt();
        System.out.println("Ussunu giriniz :");
        us=input.nextInt();
        System.out.println(sayi + " kadar ki "+us+" kuvvetleri");
        for (i=0;i<=sayi;i++){
            k=Math.pow(us,i);

            if (k<=sayi){

                System.out.println(k);
               }

           }

        System.out.println("Ussunu giriniz :");
        us=input.nextInt();

        System.out.println(sayi + " kadar ki "+us+" kuvvetleri");

        for (i=0;i<=sayi;i++){
            k=Math.pow(us,i);

            if (k<=sayi){

                System.out.println(k);
            }

        }

        }
    }

