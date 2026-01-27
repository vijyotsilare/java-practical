class sy2024bit047{
   public static void printpattern1(int n){
         for(int i = 1;i<=n-1;i++){
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            for(int k = 0;k<2*(n-i)-1;k++){
                System.out.print(" ");
            }
            for(int j = 0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 0;i<n+(n-1);i++){
            System.out.print("*");
        }
    }
    public static void printpattern2(int n){
        for(int i = 0;i<n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j = 0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
     public static void printpattern3(int n){
        for(int i = 1;i<=2*n-1;i++){
            int space = i;
            if(i>n){
                space = 2*n-i;
            }
            for(int j = 1;j<=n-space;j++){
                System.out.print(" ");
            }
            for(int j = 1;j<=space;j++){
                System.out.print("+ ");
            }
            System.out.println();
        }

        }
      public static void printpattern4(int n){
         int num = 1;
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(num);
                num = num + 1;
            }
            System.out.println();
        }

      }
       public static void printpattern5(int n){

        for(int i = 1;i<=2*n-1;i++){
            int space = i;
            if(i>n){
                space = 2*n-i;
            }
            for(int j = 1;j<=n-space;j++){
                System.out.print(" ");
            }
              int num = space;
            for(int j = 1;j<=space;j++){
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }

      }
      

    public static void main(String args[]){
        printpattern1(4);  
        printpattern2(4); 
        printpattern3(4); 
        printpattern4(4); 
        printpattern5(4); 
    }


}