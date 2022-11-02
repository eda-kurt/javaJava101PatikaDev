package DaireAlanveCevre;

import java.util.Scanner;

public class daireAlanVeCevre {
    public static void main(String[] args) {
        double yariCap,alan,cevre,piSayisi,us,merkezAci,cevreAci;
        Scanner input=new Scanner(System.in);
        System.out.println("Daire yaricapini giriniz : ");
        yariCap=input.nextInt();

        us=2;
        piSayisi=3.14;

        alan=piSayisi*Math.pow(yariCap, us);
        System.out.println("Dairenin alani :" + alan);

        cevre=2*piSayisi*yariCap;
        System.out.println("Dairenin cevresi :" + cevre);

        System.out.println(" Dairenin merkez aci olcusunu giriniz : ");
        merkezAci=input.nextInt();
        cevreAci=(piSayisi*Math.pow(yariCap, us)*merkezAci)/360;
        System.out.println("Merkez acisi " + merkezAci + " olan dairenin alani : "+ cevreAci);

    }
}
