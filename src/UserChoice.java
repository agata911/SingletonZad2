import java.util.Scanner;

public interface UserChoice {

    static void UserChoice() {
        System.out.println("wybierz co chcesz zrobić ");
        System.out.println("zapis tekstu do pliku: t ");
        System.out.println("zapis losowej liczby do pliku: l ");
        //System.out.println("zapis losowej liczby i tekstu do pliku: q");
        String t = "t";
        String l = "l";
        //String q = "q";
        Scanner scann = new Scanner(System.in);
        String wybor = scann.nextLine();

        if(wybor.equals("t")) {
            TekstDoPliku.extractedTekst();

        }
        if(wybor.equals("l")) {

            LiczbaDoPliku.extractedLiczba();
        }
    }
}
