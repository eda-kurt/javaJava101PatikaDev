package TaksiMetreHesaplayanProgram;

import java.util.Scanner;

public class TaksiMetreHesaplama {
    public static void main(String[] args) {
        double km,kmTutari,minTutar,acilisTutar;
        Scanner input=new Scanner(System.in);

        System.out.println("Gidilen mesafeyi km cinsinde giriniz : ");
        km=input.nextInt();


        acilisTutar=10;
        minTutar=20;
        kmTutari=km*2.20+10;

        boolean odenecekTutar=kmTutari<=20;
        double str=odenecekTutar ? minTutar:kmTutari;

        System.out.println("Km ye gore Taksimetre Tutariniz :" + str);

    }
}
