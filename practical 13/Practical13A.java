class Practical13A {

    public static void main(String[] args) {

        try {
            // 1. Validate arguments
            if (args.length < 2) {
                System.out.println("Usage: java Example 'char' 'string'");
                return;
            }

            // 2. Handle extra arguments
            if (args.length > 2) {
                System.out.println("Note: Extra arguments detected. Ignoring them...");
            }

            // 3. Validate first argument
            if (args[0].length() != 1) {
                throw new IllegalArgumentException("First argument must be exactly one character.");
            }

            char ch = args[0].charAt(0);
            String str = args[1];

            // Approach 1
            System.out.println("\n--- Approach 1: Using charAt ---");
            System.out.println("Count = " + countUsingCharAt(ch, str));

            // Approach 2
            System.out.println("\n--- Approach 2: Using toCharArray ---");
            System.out.println("Count = " + countUsingArray(ch, str));

            // Approach 3
            System.out.println("\n--- Approach 3: Using replace ---");
            System.out.println("Count = " + countUsingReplace(ch, str));

	    // Approach 4
            System.out.println("\n--- Approach 4: Using substring ---");
            System.out.println("Count = " + countUsingSubstring(ch, str));



        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Approach 1: charAt method
    public static int countUsingCharAt(char ch, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // Approach 2: toCharArray method
    public static int countUsingArray(char ch, String str) {
        int count = 0;
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    // Approach 3: replace method
    public static int countUsingReplace(char ch, String str) {
        int originalLength = str.length();
        String newStr = str.replace(String.valueOf(ch), "");
        return originalLength - newStr.length();
    }

   // Approach 4: Substring method
	 public static int countUsingSubstring(char ch, String str) {	
        int count=0;
	String target = String.valueOf(ch);        
        for(int i=0;i<str.length();i++){
     
        if(str.substring(i, i+1).equals(target)){
             count++;
          }
     
	}
	return count;
     }

}