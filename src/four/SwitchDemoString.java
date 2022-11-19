package four;

import java.util.Scanner;

/**
 * switch prima kao input dakle ono sto je u malim zagradama int ili
 * nesto sto je konvert u int.
 *
 * od verzije jave 7 u switch može ici u male zagrade i string  vrijednost ili string varijabla
 */
public class SwitchDemoString {
    public static void main(String[] args) {
        System.out.println("Unesite ime dana :");
        String imeDanaNaNjemackom = new Scanner(System.in).nextLine();
       int redniBrojDana = switch (imeDanaNaNjemackom){
           case "Montag" -> {yield 1;}
           case "Dienstag" -> {yield 2;}
           case "Mittwoch" -> {yield 3;}
           case "Donnerstag" -> {yield 4;}
           case "Freitag" -> 5;
           case "Samstag" -> {yield 6;}
           case "Sonntag" -> {yield 7;}
           default -> {yield -1;}

       };
        System.out.println(imeDanaNaNjemackom + " je po redu"  + redniBrojDana+" .u sedmici");
    }
}
