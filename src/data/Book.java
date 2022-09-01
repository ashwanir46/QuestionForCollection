package data;

public class Book {
    private String bookName;
    private String authorName;
    private long isbn;
    private double price;

    public Book() {

    }

    public Book(String bookName, String authorName, long isbn, double price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.isbn = isbn;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", isbn=" + isbn +
                ", price=" + price +
                '}';
    }
}
