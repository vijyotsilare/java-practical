//Single_Inheritance
	

class Book{
String title="Java Programming";

static void pages(){
	System.out.println("Total Pages in Book:"+111);
}
}

class Author extends Book{
String name="Mr.Kanetkar";

static void totalBooks(){
	System.out.println("Total Books Written:"+15);
}

public static void main(String[] args){
	Author a=new Author();
	System.out.println("Book name:"+a.title);
	System.out.println("Author name:"+a.name);
	a.pages();
	a.totalBooks();
}
}