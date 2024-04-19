public enum ESteps {
    STEP1(Calcula10_20.class),
    STEP2(Calcula21_50.class),
    STEP3(Calcula51_100.class);

    private final Class<?> associatedClass;

    ESteps(Class<?> associatedClass) {
        this.associatedClass = associatedClass;
    }

    public Class<?> getAssociatedClass() {
        return associatedClass;
    }
}
