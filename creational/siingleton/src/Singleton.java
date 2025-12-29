// this will be good for lazy initialization
// but this is not thread safe
public class Singleton {
    /* here we're defining instance of the same class  */
    private static Singleton instance;
    /* this value is just for testing */
    public String value;

    private Singleton(String value) {
        try {
            /* here it will late for first time */
            Thread.sleep(1000);
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        this.value = value;

    }

    public static Singleton getInstance(String value) {
        if (instance == null){
            instance = new Singleton(value);
        }
        return instance;
    }
}
