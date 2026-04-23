interface A {
    void show();
}

interface B extends A {
    void display();
}

class Demo implements B {
    public void show() {
        System.out.println("Show method");
    }

    public void display() {
        System.out.println("Display method");
    }
}

public class Practical14D {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}