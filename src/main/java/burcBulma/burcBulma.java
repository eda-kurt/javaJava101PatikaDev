package burcBulma;

import java.util.Scanner;

public class burcBulma {

    public static void main(String[] args) {
        String month;
        int day;
        Scanner input= new Scanner(System.in);

        System.out.println("Ayinizi giriniz : ");
        month=input.next();
        System.out.println("Dogum Gununuzu giriniz : ");
        day=input.nextInt();

       switch (month){
           case "mart":if (day<=20){
               System.out.println("Burcunuz Balik");}
               else {
               System.out.println("Burcunuz Koc");
           }
               break;

           case "nisan":if (day<=20){
               System.out.println("Burcunuz Koc");}
           else {
               System.out.println("Burcunuz Boga");
           }
           break;

           case "mayis":if (day<=21){
               System.out.println("Burcunuz Boga");}
           else {
               System.out.println("Burcunuz ikizler");
           }
           break;

           case "haziran":if (day<=22){
               System.out.println("Burcunuz ikizler");}
           else {
               System.out.println("Burcunuz yengec");
           }
           break;

           case "temmuz":if (day<=22){
               System.out.println("Burcunuz yengec");}
           else {
               System.out.println("Burcunuz aslan");
           }
           break;

           case "agustos":if (day<=22){
               System.out.println("Burcunuz aslan");}
           else {
               System.out.println("Burcunuz basak");
           }
           break;

           case "eylul":if (day<=22){
               System.out.println("Burcunuz Basak");}
           else {
               System.out.println("Burcunuz terazi");
           }
           break;

           case "ekim":if (day<=22){
               System.out.println("Burcunuz terazi");}
           else {
               System.out.println("Burcunuz akrep");
           }
           break;

           case "kasim":if (day<=21){
               System.out.println("Burcunuz akrepk");}
           else {
               System.out.println("Burcunuz yay");
           }
           break;

           case "aralik":if (day<=21){
               System.out.println("Burcunuz yay");}
           else {
               System.out.println("Burcunuz oglak");
           }
           break;

           case "ocak":if (day<=21){
               System.out.println("Burcunuz oglak");}
           else {
               System.out.println("Burcunuz kova");
           }
           break;

           case "subat":if (day<=19){
               System.out.println("Burcunuz kova");}
           else {
               System.out.println("Burcunuz balik");
           }
           break;

       }


    }
}
