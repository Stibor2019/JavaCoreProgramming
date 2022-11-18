package four;

import java.util.Scanner;

/**
 * swich-case-break
 * switch-case
 * switch-spojeni case
 * Postavka zadatka:
 * Program dopušta korisniku radni broj dan u sedmici
 * nakon unosa ispisuje ime dana na Njemačkom
 */
public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici:");
        int redniBrojDana = new Scanner(System.in).nextInt();

        if (redniBrojDana < 1 || redniBrojDana > 7) {
            System.out.println("Prvo naučite koliko sedmica ima dana pa onda Njemački..");
        } else {
            switch (redniBrojDana) {
                case 1:
                    System.out.println("Montag");
                    break;
                case 2:
                    System.out.println("Dienstag");
                    break;
                case 3:
                    System.out.println("Mittwoch");
                    break;
                case 4:
                    System.out.println("Donerstag");
                    break;
                case 5:
                    System.out.println("Freitag");
                    break;
                case 6:
                    System.out.println("Samstag");
                    break;
                case 7:
                    System.out.println("Sontag");
                    break;
                default:
                    System.out.println("Prvo naučite koliko sedmica ima dana pa onda Njemački..");
            }
        }
    }}
