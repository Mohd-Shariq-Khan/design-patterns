
public class SingletonDesignPattern {

    private static final SingletonDesignPattern instance;

    private Object lock = new Object();

    private SingletonDesignPattern() {

    }

    public  static SingletonDesignPattern getInstance() {
        if (instance == null) {
            synchronized (lock) {
                instance = new SingletonDesignPattern();
            }
        }
        return instance;
    }

}