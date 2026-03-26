//Multilevel_Inheritance
	
//parent class LV.1

class Author {
	String name="Mr.Kanetkar";

	static void totalBooks(){
		System.out.println("Total Books Written:"+15);
 	}
}
//parent class 2 LV.2

class Book extends Author{
	String title="Java Programming";

	static void pages(){
		System.out.println("Total Pages in Book:"+999);
	}
}
 
//Child of Parent 1 & 2

class Chapter extends Book{
	String chapterName="Inheritance";

	static void topics(){
		System.out.println("Total topics:"+9);
	}



public static void main(String[] args){
	Chapter a=new Chapter();
	System.out.println("Book name:"+a.title);
	System.out.println("Author name:"+a.name);
	a.pages();
	a.totalBooks();
	System.out.println("Chapter name:"+a.chapterName);
	a.topics();
}
}