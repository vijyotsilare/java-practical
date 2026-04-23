public class Practical12D {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch(Exception e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally executed");
        }
    }
}