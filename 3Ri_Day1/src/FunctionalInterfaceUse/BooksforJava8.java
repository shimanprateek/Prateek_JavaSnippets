package FunctionalInterfaceUse;

public class BooksforJava8 {
	 
	    int id;  
	    String name;  
	    int price;  
	    String author;
	    String publisher;
	    int quantity;
	    
	    public BooksforJava8 (int id, String name,int price, String author, String publisher, int quantity) {    
	        this.id = id;    
	        this.name = name;  
	        this.price = price;
	        this.author = author;    
	        this.publisher = publisher;    
	        this.quantity = quantity;	
	    }

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublisher() {
			return publisher;
		}

		public void setPublisher(String publisher) {
			this.publisher = publisher;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	

}
