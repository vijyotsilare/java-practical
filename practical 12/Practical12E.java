public class Practical12E {
    public static void main(String[] args) {
        try {
            throw new Exception("Custom exception");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}