import java.util.Scanner;

public class esercizio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scrivi una stringa");
        String s = scanner.nextLine();
        boolean pari = stringaPariDispari(s);
        if (pari)
            System.out.println("La lunghezza della stringa è pari.");
        else
            System.out.println("La lunghezza della stringa è dispari.");


        System.out.println("Inserisci una data");
        int anno = scanner.nextInt();
        if (annoBisestile(anno)){
            System.out.println(anno + " è un anno bisestile");
        }
        else {
            System.out.println(anno + " non è un anno bisestile");
        }


    }

public static boolean stringaPariDispari(String s){
    return s.length() %2 == 0;
    }

public static boolean annoBisestile(int anno){
        if (anno % 4 == 0){
            return true;
        }
        else if (anno % 100 == 0 || anno %400 == 0){
            return true;
        }
        else {
            return false;
        }
}

}
