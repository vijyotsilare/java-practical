 class prac7 {

    
    static long factorialIterative(int n) {
        if (n < 0) return -1;       // Negative = invalid
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        return result;
    }


    static long factorialRecursive(int n) {
        if (n < 0) return -1;       // Negative = invalid
        if (n == 0 || n == 1) return 1;  // Base case
        return n * factorialRecursive(n - 1);
    }
static int countIter1(String s1, String s2) {
        int count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            boolean match = true;
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    match = false;
                    break;
                }
            }
            if (match) count++;
        }
        return count;
    }

       static int countIter2(String s1, String s2) {
        int count = 0;
        for (int i = 0; i <= s1.length() - s2.length(); i++) {
            if (s1.substring(i, i + s2.length()).equals(s2)) {
                count++;
            }
        }
        return count;
    }

       static int countIter3(String s1, String s2) {
        int count = 0;
        int index = 0;
        while ((index = s1.indexOf(s2, index)) != -1) {
            count++;
            index++;
        }
        return count;
    }


    static int countRec1(String s1, String s2) {
        if (s1.length() < s2.length()) return 0;  // Base case
        int found = s1.startsWith(s2) ? 1 : 0;
        return found + countRec1(s1.substring(1), s2);
    }

    static int countRec2(String s1, String s2, int index) {
        if (index > s1.length() - s2.length()) return 0;  // Base case
        int found = s1.substring(index, index + s2.length()).equals(s2) ? 1 : 0;
        return found + countRec2(s1, s2, index + 1);
    }
    static int countRec3(String s1, String s2) {
        if (s1.length() < s2.length()) return 0;  // Base case
        int index = s1.indexOf(s2);
        if (index == -1) return 0;
        return 1 + countRec3(s1.substring(index + 1), s2);
    }

public static void main(String[] args) {

        
        System.out.println("Iterative: 5! = " + factorialIterative(5));
        System.out.println("Iterative: 0! = " + factorialIterative(0));
        System.out.println("Iterative: -3 = " + factorialIterative(-3));
        System.out.println("Recursive: 5! = " + factorialRecursive(5));
        System.out.println("Recursive: 0! = " + factorialRecursive(0));
        System.out.println("Recursive: -3 = " + factorialRecursive(-3));

        String s1 = "SGGSIE&TSGGS";
        String s2 = "SGGS";
        System.out.println("S1 = " + s1);
        System.out.println("S2 = " + s2);
        System.out.println("Expected = 2");


        System.out.println("Logic 1 (charAt)     : " + countIter1(s1, s2));
        System.out.println("Logic 2 (substring)  : " + countIter2(s1, s2));
        System.out.println("Logic 3 (indexOf)    : " + countIter3(s1, s2));

   
        System.out.println("Logic 1 (startsWith) : " + countRec1(s1, s2));
        System.out.println("Logic 2 (index param): " + countRec2(s1, s2, 0));
        System.out.println("Logic 3 (indexOf)    : " + countRec3(s1, s2));
    }
}