package Java8;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price:INR " + price);
    }

    public double discountedPrice(double discountPercent) {
    	
        double discountAmount = (discountPercent / 100) * price;
        
        return price - discountAmount;
    }

    public static void main(String[] args) {
     
        Book book = new Book("9788179921623", "The Monk Who Sold His Ferrari", "Robin Sharma", 500);

        System.out.println("Book details:");
        
        book.displayDetails();

        double discountedPrice = book.discountedPrice(10);
        
        System.out.println("Discounted price (10% off): INR " + discountedPrice);
    }
}