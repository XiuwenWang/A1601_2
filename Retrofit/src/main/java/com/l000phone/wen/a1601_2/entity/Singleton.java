

public class Singleton {
    private static volatile Singleton mInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        Singleton instance = mInstance;
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                    mInstance = instance;
                }
            }
        }
        return instance;
    }
}