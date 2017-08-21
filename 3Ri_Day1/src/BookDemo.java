class Book
{
  int pages;
  float price;
  String name;
  
  Book()
  {
	  pages = 100;
	  price = 200.45f;
	  name = "C Programming";
  }
  
  
  Book(int pages,float price,String name)
  {
	  this.pages = pages;
	  this.price = price;
	  this.name = name;
  }
  void show()
  
  {
	  System.out.println(pages + " : " + price + " : " + name);
	  
  }
}


public class BookDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b = new Book();
		Book b1 = new Book(200,356.25f,"Java Programming");
		b.show();
		b1.show();
	}

}
