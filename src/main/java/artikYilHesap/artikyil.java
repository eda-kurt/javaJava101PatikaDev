package artikYilHesap;

import java.util.Scanner;

public class artikyil {
    public static void main(String[] args) {
        int artikYil,kalan;
        Scanner input=new Scanner(System.in);
        System.out.println("Yili giriniz : ");
        artikYil=input.nextInt();

        kalan=artikYil%4;
        int kalan2 = artikYil % 100;

        System.out.println(kalan);
        if (kalan==0 || kalan2==0 ){
                System.out.println(artikYil+ " bir artik Yildir !");
        }
        else {
            System.out.println(artikYil + " bir artik Yil Degildir ! ");
        }

    }
}
