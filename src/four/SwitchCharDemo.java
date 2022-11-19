package four;

public class SwitchCharDemo {
    public static void main(String[] args) {
        char ocjena = 'A';

        //u switch izrar može ići integer ili nesto što je konvertibilno u int
        int ocjenaBrojevno = switch (ocjena) {
            case 'A'-> {
                yield 10;
            }
            case 'B' -> {
                yield 9;
            }
            default -> {
                yield 6;
            }
        };
        System.out.println("Ocjena je :" +ocjenaBrojevno);
    }


    }
