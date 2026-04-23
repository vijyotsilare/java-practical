public class Practical12C {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch(ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch(Exception e) {
            System.out.println("General Error");
        }
    }
}