import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        MODELO #1

        File file = new File("src/resource/mnt/file");
        Scanner sc = null;

        System.out.println("\n");
        
        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println("METODO #1: " + line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (sc != null){
                sc.close();
            }
        }

//        MODELO #2
        String path = "src/resource/mnt/file";
        FileReader fr = null;
        // gerencia a memoria para leitura
        BufferedReader br = null;

        System.out.println("\n");

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();

            while (line != null){
                System.out.println("METODO #2: " + line);
                line = br.readLine();
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }finally {
            try{
                br.close();
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

//        METODO #3 -> melhoria do #2 (try with resources)
        try(BufferedReader br2 = new BufferedReader(new FileReader(path))){
            String line = br2.readLine();

            System.out.println("\n");
            while (line != null){
                System.out.println("METODO #3: " + line);
                line = br2.readLine();
            }
        }catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
}