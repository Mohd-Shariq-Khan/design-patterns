
public class SingletonDesignPattern {

    private static final SingletonDesignPattern object;

    private Object lock = new Object();

    private SingletonDesignPattern() {
            System.out.println("Hello");
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
