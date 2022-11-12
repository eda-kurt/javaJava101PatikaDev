package MukemmelSayi;

import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int number = input.nextInt();

        int sum=0;
        for(int i=1; i<number; i++){
            if(number % i ==0){
                sum +=i;
            }
        }
        if(number == sum) System.out.println(number+" Mükemmel sayıdır.");
        else System.out.println(number+" Mükemmel sayı değildir.");
    }
}
