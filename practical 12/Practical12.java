import java.util.Scanner;
class Practical12 extends Exception{
		public static void main(String args[]){
			Scanner sc= new Scanner(System.in);
				
			System.out.println("Give input:");
		int a=sc.nextInt();
			
			int b=0;
			int result=(a/b);
		
		
		try{
			System.out.println(result);
	}
		catch(ArithmeticException e){
			System.out.println("Error: Arithematic Exception");
			System.out.println("cannot divide by zero");
	}
}
}