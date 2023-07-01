package junit;

public class Sub {
    private int a, b;

    public Sub(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int calc() {
        int x = a;
        int y = b;
        return x - y;
    }


    public int calcNegative() {
        if (a < 0 && b < 0) {
            return a - b;
        } else {
            return -1;
        }
    }
}
