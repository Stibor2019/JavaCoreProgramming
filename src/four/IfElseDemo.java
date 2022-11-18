package four;


/**
 * Profesor treba da se fokusira na analizu vašeg ispita i procjenu broja bodova.
 * Program treba na osnovu broja bodova da profi izbaci koju ocjenu student zaslužuju.
 */

import java.util.Scanner;
public class IfElseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite broj bodova ostvarenih na ispitu:");
        int brojBodova = new Scanner(System.in).nextInt();
        char ocjena;
        if(brojBodova>=90){
            ocjena ='A';
        }else if (brojBodova>=80){
            ocjena ='B';
        }else if (brojBodova>=70){
            ocjena ='C';
        }else if (brojBodova>=60){
            ocjena ='D';
        }else{
            ocjena ='E';

        }
        System.out.println("Ocjena : " + ocjena);
    }
}
