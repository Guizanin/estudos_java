public class Main {
    public static void main(String[] args) {
        var text = Enum.valueOf("METHOD_" + "1").HandleMethod(0, "texto");
        System.out.println(text);
    }
}