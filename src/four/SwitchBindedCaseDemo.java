package four;

import java.util.Scanner;

/**
 * program pita korisnika da unese redni broj dana u sedmici
 * ukoliko je korisnik unio broj 1 ispisace sve dane u sedmici
 * ukoliko je korisnnik unio 3 ispisaće Mittwoch i preostale dane u sedmici a izostaviti montag i dienstag
 */
public class SwitchBindedCaseDemo {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici:");
        int redniBrojDana = new Scanner(System.in).nextInt();
        String daniTekstualno;
        switch(redniBrojDana){
            case 1:
                daniTekstualno = "Montag,Dienstag, Mitwoch,Donerstag,Freitag,Samstag,Sontag";
                break;
            case 2:
                daniTekstualno = "Dienstag, Mitwoch,Donerstag,Freitag,Samstag,Sontag";
                break;
            case 3:
                daniTekstualno = " Mitwoch,Donerstag,Freitag,Samstag,Sontag";
                break;
            case 4:
                daniTekstualno = "Donerstag,Freitag,Samstag,Sontag";
                break;
            case 5:
                daniTekstualno = "Samstag,Sontag";
                break;
            case 6:
                daniTekstualno = "Samstag,Sontag";
                break;
            case 7:
                daniTekstualno = "Sontag";
                break;

            default:
                daniTekstualno = "Neodgovarajući broj dana u sedmici" ;
                break;

        }
        System.out.println(daniTekstualno);
    }
}

