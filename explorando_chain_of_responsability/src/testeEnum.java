public enum testeEnum {
    STEP1("STEP 1 DO TESTE"),
    STEP2("STEP 2 DO TESTE");

    private final String tipo;

    testeEnum(String tipo){
        this.tipo = tipo;
    }

    public static testeEnum getByIndex(int index) {
        if (index >= 0 && index < values().length) {
            return values()[index];
        }
        throw new IllegalArgumentException("Índice inválido para StepEnum");
    }

    public String getTipo(){
        return tipo;
    }
}
