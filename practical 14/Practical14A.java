interface Printer {
    void print();
}

class LaserPrinter implements Printer {
    public void print() {
        System.out.println("Printing using Laser Printer");
    }
}

public class Practical14A {
    public static void main(String[] args) {
        Printer p = new LaserPrinter();
        p.print();
    }
}