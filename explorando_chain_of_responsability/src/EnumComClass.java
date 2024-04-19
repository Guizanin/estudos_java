public enum EnumComClass {
    STEP1(Calcula10_20.class),
    STEP2(Calcula21_50.class);

    private final Class<?> associatedClass;

    EnumComClass(Class<?> associatedClass) {
        this.associatedClass = associatedClass;
    }

    public Class<?> getAssociatedClass() {
        return associatedClass;
    }

    public static EnumComClass getByIndex(int index) {
        if (index >= 0 && index < values().length) {
            return values()[index];
        }
        throw new IllegalArgumentException("Índice inválido para StepEnum");
    }
}
