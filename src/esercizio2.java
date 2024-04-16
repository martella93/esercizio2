import java.util.Scanner;

public class esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi un numero");
        int num = scanner.nextInt();
        System.out.println(stampaNumero(num));

    }

    public static String stampaNumero(int num){
        String ris;
        switch (num){
            case 0: {
                ris = "zero";
                break;
            }
            case 1: {
                ris = "uno";
                break;
            }
            case 2: {
                ris = "due";
                break;
            }
            case 3: {
                ris = "tre";
                break;
            }
            default:
                ris = "numero non compreso tra zero e tre";
        }
        return ris;
    }
}
