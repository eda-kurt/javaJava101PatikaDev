package manavKasaProgrami;

import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplamTutar;

        Scanner input=new Scanner(System.in);
        System.out.println("Armut kac kilo ? : ");
        armut=input.nextDouble();

        System.out.println("Elma kac kilo ? : ");
        elma=input.nextDouble();

        System.out.println("Domates kac kilo ? : ");
        domates=input.nextDouble();

        System.out.println("Muz kac kilo ? : ");
        muz=input.nextDouble();

        System.out.println("Patlican kac kilo ? : ");
        patlican=input.nextDouble();

        toplamTutar=(armut*2.14)+(elma*3.67)+(muz*0.95)+(patlican*5.00)+(domates*1.11);
        System.out.println("Toplam Tutar : " + toplamTutar);

    }
}
