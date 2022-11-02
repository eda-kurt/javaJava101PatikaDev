package hipotenusBulanProgram;

import java.util.Scanner;

public class HipotenusBulanProgram {
    public static void main(String[] args) {
        double kenarA,kenarB,kenarC,hipotenus,u,alan,cevre;
        Scanner input=new Scanner(System.in);
        System.out.println("Dik Ucgenin  Dik 'a' kenar uzunlugunu giriniz : ");
        kenarA=input.nextInt();
        System.out.println("Dik Ucgenin Dik 'b' kenar uzunlugunu giriniz : ");
        kenarB=input.nextInt();

        kenarC=Math.sqrt(kenarA*kenarA+kenarB*kenarB);
        System.out.println("Ucgenin 'c' kenar uzunlugu :"+kenarC);



        cevre=kenarA+kenarB+kenarC;
        System.out.println("Dik ucgenin cevresi : " + cevre);

        u=cevre/2;
        alan=u*(u-kenarA)*(u-kenarB) * (u-kenarC);
        System.out.println("Dik ucgenin alani : "+ alan);





    }
}
