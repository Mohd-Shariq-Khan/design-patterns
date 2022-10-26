
public class ImmutableClass {

    private final int a;
    private final String b;
    private final Map<Integer, String> m;

    public ImmutableClass(int a, String b, Map<Integer, String> m) {
        this.a = a;
        this.b = b;

        Map<Integer, String> tmp = new HashMap<>();

        for(Map.Entry<Integer, String> t: m.entrySet()) {
            tmp.put(t.getKey(), t.getValue());
        }

        this.m = tmp;
    }

    public int getA() {
        return this.a;
    }

    public String getB() {
        return this.b;
    }

    public Map<Integer, String> getM() {
        Map<Integer, String> tmp = new HashMap<>();

        for(Map.Entry<Integer, String> t: this.m.entrySet()) {
            tmp.put(t.getKey(), t.getValue());
        }

        return tmp;
    }
}


class Main {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        m.put(1, "2344");


        i = new ImmutableClass(1, "Hello", m);
        i.getM().put(2, "")

    }
}