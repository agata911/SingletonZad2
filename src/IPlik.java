import java.io.File;
import java.util.Scanner;

public interface IPlik {
    static File getFile(Scanner scan) {
        String nazwaPliku = scan.nextLine();
        File file = new File (nazwaPliku);
      return file;
    }

    static Scanner getScanner() {
        Scanner scan = new Scanner(System.in);
        System.out.println("podaj nazwe pliku: ");
//        String nazwaPliku = scan.nextLine();
//        File file = new File (nazwaPliku);
        return scan;

    }

    static void extractedFile(File file) {
        if(!file.exists()){
            try{
                file.createNewFile();
                System.out.println("plik został utworzony ");}catch(Exception e){
                System.out.println(e.getMessage());}
        }
    }
}
