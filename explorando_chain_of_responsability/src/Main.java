public class Main {
    public static void main(String[] args) {
        Calcula10_20 calc = new Calcula10_20();

        System.out.println("Hello World!");
        testeEnum step = testeEnum.getByIndex(1);
        System.out.println("teste: " + testeEnum.valueOf("STEP1").getTipo() );
        System.out.println("teste do getByIndex: " + step);
        System.out.println("teste do getByIndex chamando o conteudo do step: " + step.getTipo());

        calc.execute(15, 0);

    }
}

