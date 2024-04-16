import java.util.Scanner;

public class esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";

        do {
            System.out.println("inserisci una stringa; il ciclo non si fermerà finchè non iserisci :q");
            input = scanner.nextLine();
            String[] caratteri = input.split("");
            System.out.println(String.join(",", caratteri));
        }
        while (!input.equals(":q"));
        System.out.println("exit");

    }

}
