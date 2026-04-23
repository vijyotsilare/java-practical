class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class Practical12G {
    public static void main(String[] args) {
        int marks = -10;

        try {
            if(marks < 0) {
                throw new InvalidMarksException("Marks cannot be negative");
            }
        } catch(InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}