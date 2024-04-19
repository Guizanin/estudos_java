import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//      Objeto chave: valor
        Map<String, String> mapStringString = new HashMap<>();
        mapStringString.put("nome", "Guilherme");
        mapStringString.put("telefone", "(54) 555-5555");

        System.out.println("O mapa é: " + mapStringString);

        // ----------------
//      Array list
        List<String> lista = new ArrayList<>();
        lista.add("Guiherme");
        lista.add("(54) 555-5555");

        System.out.println("Lista: " + lista);

        // -----------------
//      Objecto com arraysList
        Map<String, List<String>> mapStringListString = new HashMap<>();
        mapStringListString.put("nome", lista);

        System.out.println("Objeto com arrayList:" + mapStringListString);

        // -----------------
        // objeto de objetos
        Map<String, List<Object>> mapStringListString1 = new HashMap<>();
        List<Object> lista1 = new ArrayList<>();
        lista1.add(mapStringString);
        mapStringListString1.put("dadosUser", lista1);
        System.out.println("Objeto com arrayList:" + mapStringListString1);



    }
}