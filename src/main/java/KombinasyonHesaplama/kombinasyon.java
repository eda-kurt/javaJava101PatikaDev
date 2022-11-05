package KombinasyonHesaplama;

import java.util.Scanner;

public class kombinasyon {

    public static void main(String[] args) {
        int i=0,n,r,nTotal=1,rTotal = 1,nrTotal=1;
        Scanner input=new Scanner(System.in);

        System.out.println("Sayi giriniz : ");
        n=input.nextInt();
        System.out.println("2. Sayiyi Giriniz : ");
        r=input.nextInt();

        for (i=1;i<=n;i++){
            nTotal=nTotal*i;
        }
        System.out.println(nTotal);
        
        for (i=1;i<=r;i++){
            rTotal=rTotal*i;
        }
        System.out.println(rTotal);
        
        for (i=1;i<=n-r;i++){
            nrTotal=nrTotal*i;
        }
        System.out.println(nrTotal);
        
        System.out.println( " Kombinasyon : "+nTotal/(rTotal*nrTotal));
    }
}
