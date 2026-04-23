class Practical13B {

    static void sum(int... nums) {
        int total = 0;
        for (int n : nums) total += n;
        System.out.println("Sum = " + total);
    }

    static void display(String... names) {
        for (String n : names) {
            System.out.println(n);
        }
    }

    static void fun(int... a) {
        System.out.println("int varargs");
    }

    static void fun(float... f) {
        System.out.println("float varargs");
    }

    static void valid(int x, int... a) {
        System.out.println("Valid vararg position");
    }

    public static void main(String[] args) {

        sum(1,2,3);
        sum();

        display("Yash", "Amit");

        fun(1,2,3); 

        valid(5,10,20);

        System.out.println("Ambiguity cases explained ");
    }
}