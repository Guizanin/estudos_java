public interface ICalcula {
    void execute(Integer i, Integer step);
    default Class<?> next(Integer step){
        var indexStep = EnumComClass.getByIndex(step+1).toString();
        return  EnumComClass.valueOf(indexStep).getAssociatedClass();
    }
}
