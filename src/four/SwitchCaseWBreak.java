package four;


import java.util.Scanner;

public class SwitchCaseWBreak {
    public static void main(String[] args) {
        System.out.println("Unesite redni broj dana u sedmici:");
        int redniBrojDana = new Scanner(System.in).nextInt();
        String daniTekstualno = "";
        switch (redniBrojDana) {
            case 1:
                daniTekstualno = "Montag";
            case 2:
                daniTekstualno = daniTekstualno + "Dienstag";

            case 3:
                daniTekstualno = daniTekstualno + " Mitwoch";

            case 4:
                daniTekstualno = daniTekstualno + " Donerstag";

            case 5:
                daniTekstualno = daniTekstualno + " Freitag";

            case 6:
                daniTekstualno = daniTekstualno + " Samstag";

            case 7:
                daniTekstualno = daniTekstualno + " Sontag";
                break;

            default:
                daniTekstualno = " Neodgovarajući broj dana u sedmici";
                break;
        }
    }
}
