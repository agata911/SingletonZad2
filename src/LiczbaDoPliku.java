import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;

public class LiczbaDoPliku implements IPlik {

    public static void extractedLiczba() {
        Scanner scan = IPlik.getScanner();
        File file = IPlik.getFile(scan);
        IPlik.extractedFile(file);
        if(file.canWrite()){
            try{
                FileWriter filewriter = new FileWriter(file,true);
                Formatter formatter = new Formatter(filewriter);

                Random r = new Random();
                int a = r.nextInt();
                boolean b = r.nextBoolean();
                float c = r.nextFloat();
                System.out.print(a + " " + b + " " + c);
                Scanner scannerfile = new Scanner(file);

                formatter.format("%S \r\n", a);
                formatter.format("%S \r\n", b);
                formatter.format("%S \r\n", c);
                System.out.println("\nzapisano ! ");
                formatter.close();
                filewriter.close();
                System.out.println("\nZAWARTOSC pliku:");
                while (scannerfile.hasNextLine()){
                    System.out.println(scannerfile.nextLine());
                }
                scan.close();
                scannerfile.close();

            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }

        }
    }





















//    private static void extractedFile(File file) {
//        if(!file.exists()){
//            try{
//                file.createNewFile();
//                System.out.println("plik został utworzony ");}catch(Exception e){
//                System.out.println(e.getMessage());}
//        }
//    }

//    private static File getFile(Scanner scan) {
//        String nazwaPliku = scan.nextLine();
//        File file = new File (nazwaPliku);
//        return file;
//    }
//
//    private static Scanner getScanner() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("podaj nazwe pliku: ");
//        return scan;
//    }


//    Scanner scan = new Scanner(System.in);
//        System.out.println("podaj nazwe pliku: ");
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
//
//            Random r = new Random();
//            int a = r.nextInt();
//            boolean b = r.nextBoolean();
//            float c = r.nextFloat();
//            System.out.print(a + " " + b + " " + c);
//            Scanner scannerfile = new Scanner(file);
////                Scanner scan = new Scanner(System.in);
////                System.out.println("podaj tekst do pliku: ");
////                String tekst = scan.nextLine();
//            formatter.format("%S \r\n", a);
//            formatter.format("%S \r\n", b);
//            formatter.format("%S \r\n", c);
//            System.out.println("\nzapisano ! ");
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
//}
}
