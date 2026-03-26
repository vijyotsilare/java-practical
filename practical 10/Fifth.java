//Hierarchical_Inheritance
	
//parent class 

class Author {
	String name="Mr.Kanetkar";

	static void totalBooks(){
		System.out.println("Total Books Written:"+15);
 	}
}
//child class 1

class Book1 extends Author{
	String title="Java Programming";

	static void pages(){
		System.out.println("Total Pages in Book:"+999);
	}
}
 
//Child class 2

class Book2 extends Author{
	String title="Let Us'C";

	static void topics(){
		System.out.println("Total topics in book:"+16);
	}



public static void main(String[] args){
	Book1 a=new Book1();
	Book2 b=new Book2();
//Book1
	System.out.println("Book name:"+a.title);
	System.out.println("Author name:"+a.name);
	a.pages();
	a.totalBooks();
	System.out.println("Book name:"+a.title);
	System.out.println("Author name:"+a.name);
	a.pages();
	a.totalBooks();
//Book2
	System.out.println("Book name:"+b.title);
	System.out.println("Author name:"+b.name);
	b.totalBooks();
	b.topics();
}
}