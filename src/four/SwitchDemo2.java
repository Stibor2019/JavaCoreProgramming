package four;


import java.util.Scanner;

/**
 * Program pusta korisnika da
 * 1.broj godine
 * 2.broj mjeseca u godini
 * Program informise korisnika o broju dana u datom mjesecu u godini.
 *
 */
public class SwitchDemo2 {
    public static void main(String[] args) {
        System.out.println("Unesite godinu:");
        int godina = new Scanner(System.in).nextInt();
        System.out.println("Unesite mjesec u godini:");
        int mjesec = new Scanner(System.in).nextInt();
        int brojDanaMjeseca = 0;


        switch (mjesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaMjeseca = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaMjeseca = 30;
                break;
            case 2:
                if ((godina % 4 == 0 && godina % 100 != 0) || godina % 400 == 0) {
                    brojDanaMjeseca = 29;
                } else {
                    brojDanaMjeseca = 28;
                }
                break;
            default:
                brojDanaMjeseca = 0;

                System.out.println("Broj dana u mjesecu :" + brojDanaMjeseca);
        }
    }}
