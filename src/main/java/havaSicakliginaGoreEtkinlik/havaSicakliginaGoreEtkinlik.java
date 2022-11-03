package havaSicakliginaGoreEtkinlik;

import java.util.Scanner;

public class havaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner input=new Scanner(System.in);

        System.out.println("Sicaklik degerini giriniz : ");
        heat=input.nextInt();

        if (heat<5){
            System.out.println("Kayak etkinligini yapabilirsiniz. ");
        }
        else if (5 < heat && heat < 15) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else if (15 < heat && heat < 25) {
            System.out.println("Piknike gidebilirsiniz. ");
        }
        else if ( heat > 25) {
            System.out.println("Yuzmeye gidebilirsiniz. ");
        }
        else {
            System.out.println("Tiyatroya gidebilirsiniz.");
        }
    }
    }

