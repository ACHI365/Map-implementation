package Maps;

public class Option<T> {
    private T value;


    private Option(T value){
        this.value = value;
    }

    private Option() {
        this.value = null;
    }

    public static <T> Option<T> some(T value){
        return new Option<T>(value);
    }

    public static <T> Option<T> none(){
        return new Option<T>();
    }

    public T get() throws EmptyOptionException {
        if (value == null)
            throw new EmptyOptionException();
        else
            return value;
    }

    public T getOrDefault(T defaultValue){
        if(value == null)
            return defaultValue;
        else return value;
    }

    public boolean isNone(){
        return value != null;
    }

}
