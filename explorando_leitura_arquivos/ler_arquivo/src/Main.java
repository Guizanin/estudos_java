import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/resource/mnt/file.txt");
        Scanner sc = null;

        try{
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (sc != null){
                sc.close();
            }
        }

    }
}