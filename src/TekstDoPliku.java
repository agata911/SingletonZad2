import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;

public class TekstDoPliku implements IPlik {

    public static void extractedTekst() {
        Scanner scan = IPlik.getScanner();
        File file = IPlik.getFile(scan);
        IPlik.extractedFile(file);
        if (file.canWrite()) {
            try {
                FileWriter filewriter = new FileWriter(file, true);
                Formatter formatter = new Formatter(filewriter);
                Scanner scannerfile = new Scanner(file);

                System.out.println("podaj tekst do pliku: ");
                String tekst = scan.nextLine();
                formatter.format("%S \r\n", tekst);
                System.out.println("zapisano ! ");
                formatter.close();
                filewriter.close();
                System.out.println("\nZAWARTOSC pliku:");
                while (scannerfile.hasNextLine()) {
                    System.out.println(scannerfile.nextLine());
                }
                scan.close();
                scannerfile.close();

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}


















//    private static File getFile(Scanner scan) {
//        String nazwaPliku = scan.nextLine();
//        File file = new File(nazwaPliku);
//        return file;
//    }
//
//    private static Scanner getScanner() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("podaj nazwe pliku: ");
//        return scan;
//    }





   
            


//    private final File file;
//
//    public PlTekst(File file) {
//        this.file = file;
//
//    }
//    File file1 = new File ("plik.txt");
//    boolean exist = file1.exists();
//    System.out.println ("czy istnieje" + exist);


//    Scanner scan = new Scanner(System.in);
//    System.out.println("podaj nazwe pliku: ");
//    String nazwaPliku = scan.nextLine();
//    File file = new File (nazwaPliku);
//        if(!file.exists()){
//        try{file.createNewFile();
//            System.out.println("plik został utworzony ");}catch(Exception e){
//            System.out.println(e.getMessage());}
//    }
//        if(file.canWrite()){
//        try{
//            FileWriter filewriter = new FileWriter(file,true);
//            Formatter formatter = new Formatter(filewriter);
//            Scanner scannerfile = new Scanner(file);
////                Scanner scan = new Scanner(System.in);
//            System.out.println("podaj tekst do pliku: ");
//            String tekst = scan.nextLine();
//            formatter.format("%S \r\n", tekst);
//            System.out.println("zapisano ! ");
//            formatter.close();
//            filewriter.close();
//            System.out.println("\nZAWARTOSC pliku:");
//            while (scannerfile.hasNextLine()){
//                System.out.println(scannerfile.nextLine());
//            }
//            scan.close();
//            scannerfile.close();
//
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//
//    }
