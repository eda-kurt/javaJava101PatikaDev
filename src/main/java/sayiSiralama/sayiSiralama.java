package sayiSiralama;

import java.util.Scanner;

public class sayiSiralama {
    public static void main(String[] args) {
        double n1,n2,n3;
        Scanner input = new Scanner(System.in);
        System.out.println("3 tane sayiyi sirayla giriniz");

        n1=input.nextDouble();
        n2=input.nextDouble();
        n3=input.nextDouble();

        if (n1<n2 && n1<n3){
            if (n2<n3){
                System.out.println(n1+"<"+n2+"<"+n3);
            }
            else {
                System.out.println(n1+"<"+n3+"<"+n2);
            }
        }
        else if (n2<n1 && n2<n3){
            if (n1<n3){
                System.out.println(n2+"<"+n1+"<"+n3);
            }
            else {
                System.out.println(n2+"<"+n3+"<"+n1);
            }
        }
        else if (n3<n2 && n3<n1){
            if (n2<n1){
                System.out.println(n3+"<"+n2+"<"+n1);
            }
            else {
                System.out.println(n3+"<"+n1+"<"+n2);
            }
        }

    }
}
