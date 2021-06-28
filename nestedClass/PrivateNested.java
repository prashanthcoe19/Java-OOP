package nestedClass;

class Outer {
    int y = 10;

    private class Inner {
        int x = 15;
    }

    int display_inner() {
        Inner in = new Inner();
        return in.x;
    }
}

public class PrivateNested {
    public static void main(String[] args) {
        Outer out = new Outer();
        System.out.println(out.display_inner());
    }
}
