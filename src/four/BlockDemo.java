package four;

//

import java.util.Scanner;

/**
 * Pustim korisnika da u konzolu unese broj godina
 * Program provjerava punoljetnu osobu konzumirajući njegov unos godina.
 */
public class BlockDemo {
    public static void main(String[] args) {
        System.out.println("Unesite vaš broj godina:");
        int starostKorisnikPrograma = new Scanner(System.in).nextInt();
        boolean uslovZaPunoljetnost = starostKorisnikPrograma>=18;
        if(uslovZaPunoljetnost) {
            System.out.println("Vi ste punoljetni");
        }
        else {
            System.out.println("Niste punoljetni");
        }
    }
}

