abstract class Shape {
    abstract void draw();
}

interface Color {
    void fill();
}

class Circle extends Shape implements Color {
    void draw() {
        System.out.println("Drawing Circle");
    }

    public void fill() {
        System.out.println("Filling Color");
    }
}

public class Practical14E {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.fill();
    }
}