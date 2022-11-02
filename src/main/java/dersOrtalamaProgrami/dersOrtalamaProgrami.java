package dersOrtalamaProgrami;

import java.util.Scanner;

/**
 * Eda Kurt 2022
 */
public class dersOrtalamaProgrami {
    public static void main(String[] args) {

        int Kimya,Matematik,Turkce,Fizik,Tarih,muzik;

        Scanner input = new Scanner(System.in);

        System.out.println("Kimya notunuz : ");
        Kimya=input.nextInt();
        System.out.println("Matematik notunuz : ");
        Matematik=input.nextInt();
        System.out.println("Tarih notunuz : ");
        Tarih=input.nextInt();
        System.out.println("Turkce notunuz : ");
        Turkce=input.nextInt();
        System.out.println("Fizik notunuz : ");
        Fizik=input.nextInt();
        System.out.println("Muzik notunuz : ");
        muzik=input.nextInt();

        double ortalama= (Kimya+Matematik+Tarih+Turkce+Fizik+muzik)/6;

        System.out.println("Not ortalamaniz : " + ortalama);

         boolean sonuc= ortalama>=60;
         String str= sonuc ? "Sinifi gectiniz":"Sinifta kaldiniz";
         System.out.println(str);




    }
}
