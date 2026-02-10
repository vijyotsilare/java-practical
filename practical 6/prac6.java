class prac6 {
    public static void main(String[] args) {

        String binary = "1011";
        String octal = "17";
        String hexadecimal = "1A";

        int R1 = Integer.parseInt(binary, 2);
        int R2 = Integer.parseInt(octal, 8);
        int R3 = Integer.parseInt(hexadecimal, 16);

        System.out.println("Binary result : " + R1);
        System.out.println("Octal result  : " + R2);
        System.out.println("Hex result    : " + R3);
    }
}
