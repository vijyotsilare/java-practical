//Super keyword
	

class Book{
	Book(){
		System.out.println("Book");
	}
	String title="Java Programming";

	static void pages(){
		System.out.println("Total Pages in Book:"+111);
	}
	
}

class Author extends Book{
	Author(){
		super();
		System.out.println("Author");
	}
	String name="Mr.Kanetkar";
	 void totalBooks(){
		System.out.println("Total Books Written:"+15);
		System.out.println(super.title);
		
}

public static void main(String[] args){
	Author a=new Author();
	System.out.println("Book name:"+a.title);
	System.out.println("Author name:"+a.name);
	a.pages();
	a.totalBooks();
	}
}