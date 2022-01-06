import java.io.File;
import java.util.Scanner;

public class Main implements UserChoice{

    public static void main(String[] args) {

        UserChoice.UserChoice();

    }


























    //        TekstDoPliku.extractedTekst();
//        LiczbaDoPliku.extractedLiczba();


//        String wybor = scann.nextLine();
//        if(wybor.equals(t)){
//            TekstDoPliku.extractedTekst();
//        }else if (wybor==l){
//            LiczbaDoPliku.extractedLiczba();}
//        else if(wybor==q){
//            LiczbaDoPliku.extractedLiczba();
//            TekstDoPliku.extractedTekst();
//        }


    //File file = new File (nazwaPliku);
//        String nazwaPliku = scann.nextLine();
//        File file = new File (nazwaPliku);


    //LiczbaDoPliku liczba = new LiczbaDoPliku();
    // LiczbaDoPliku.extractedLiczba();
    //TekstDoPliku tekst = new TekstDoPliku();
    //TekstDoPliku.extractedTekst();





//    private static void UserChoice() {
//        System.out.println("wybierz co chcesz zrobić ");
//        System.out.println("zapis tekstu do pliku: t ");
//        System.out.println("zapis losowej liczby do pliku: l ");
//        System.out.println("zapis losowej liczby i tekstu do pliku: q");
//        String t = "t";
//        String l = "l";
//        String q = "q";
//        Scanner scann = new Scanner(System.in);
//        String wybor = scann.nextLine();
//
//        if(wybor.equals("t")) {
//             TekstDoPliku.extractedTekst();
//
//         }
//        if(wybor.equals("l")) {
//
//            LiczbaDoPliku.extractedLiczba();
//        }
//    }
}






//    private static void extracted() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("podaj nazwe pliku: ");
//        String nazwaPliku = scan.nextLine();
//        File file = new File (nazwaPliku);
//        if(!file.exists()){
//            try{file.createNewFile();
//                System.out.println("plik został utworzony ");}catch(Exception e){
//                System.out.println(e.getMessage());}
//        }
//        if(file.canWrite()){
//            try{
//                FileWriter filewriter = new FileWriter(file,true);
//                Formatter formatter = new Formatter(filewriter);
//
//                Random r = new Random();
//                int a = r.nextInt();
//                boolean b = r.nextBoolean();
//                float c = r.nextFloat();
//                System.out.print(a + " " + b + " " + c);
//                Scanner scannerfile = new Scanner(file);
////                Scanner scan = new Scanner(System.in);
////                System.out.println("podaj tekst do pliku: ");
////                String tekst = scan.nextLine();
//                formatter.format("%S \r\n", a);
//                formatter.format("%S \r\n", b);
//                formatter.format("%S \r\n", c);
//                System.out.println("\nzapisano ! ");
//                formatter.close();
//                filewriter.close();
//                System.out.println("\nZAWARTOSC pliku:");
//                while (scannerfile.hasNextLine()){
//                    System.out.println(scannerfile.nextLine());
//                }
//                scan.close();
//                scannerfile.close();
//
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//
//        }
//    }

//    private static void pltekst() {
//    }

//        boolean exist = file1.exists();
//        System.out.println ("czy istnieje : " + exist);
//        String absolutePath = file1.getAbsolutePath();
//        System.out.println ("sciezka : " + absolutePath);