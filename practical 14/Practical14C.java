interface A {
    void show();
}

interface B {
    void display();
}

class Demo implements A, B {
    public void show() {
        System.out.println("From A");
    }

    public void display() {
        System.out.println("From B");
    }
}

public class Practical14C {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show();
        d.display();
    }
}