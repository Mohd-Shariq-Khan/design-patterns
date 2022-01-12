
public class SingletonDesignPattern {

    private static final SingletonDesignPattern object;

    private Object lock = new Object();

    private SingletonDesignPattern() {

    }

    public  static SingletonDesignPattern getInstance() {
        if (object == null) {
            synchronized (lock) {
                object = new SingletonDesignPattern();
            }
        }
        return object;
    }

}