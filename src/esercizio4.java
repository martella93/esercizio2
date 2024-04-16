import java.util.Scanner;

public class esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("inserisci un numero");
        int num = scanner.nextInt();
        countdown(num);

    }
    public static void countdown(int num){
        System.out.println("conto alla rovescia da "+ num + " a 0");
        for (int i=num; i>=0; i--){
            System.out.println(i);
        }
    }
}
