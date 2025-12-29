public class ThreadSafeSingletonRefactor {
    private static ThreadSafeSingletonRefactor instance;
    public String value;

    private ThreadSafeSingletonRefactor(String value) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }
    public static synchronized ThreadSafeSingletonRefactor getInstance(String value) {
        if (instance == null) {
            /* here there will be single thread at time */
            instance = new ThreadSafeSingletonRefactor(value);
        }
        return instance;
    }
}

//Best Singleton (Lazy + Thread-Safe + Fast)
//
//Bill Pugh method — recommended in real projects.
 class SingletonBillPugh {

    private SingletonBillPugh() {}

    // inner class loads only when getInstance() is called
    private static class Holder {
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    public static SingletonBillPugh getInstance() {
        return Holder.INSTANCE;
    }
}
