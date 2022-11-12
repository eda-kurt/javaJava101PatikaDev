package HarmonikSayi;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        double n,i,harmonikSayi,sum = 0;
        System.out.println("n giriniz : ");
        Scanner input =new Scanner(System.in);
        n =input.nextDouble();

        for(i=1; i<=n; i++){

            harmonikSayi=1/i;
            sum+=harmonikSayi;
        }
        System.out.println(sum);

    }
}
