public class Book {
    private String title;
    private Author[] authors;
    private double price;
    private int qty;

    public Book(String title, Author[] authors, double price, int qty) {
        this.title = title;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getTitle() { return title; }
    public Author[] getAuthors() { return authors; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }

    public String toString() {
        String authorList = "";
        for (int i = 0; i < authors.length; i++) {
            authorList += authors[i].getName();
            if (i < authors.length - 1) authorList += ", ";
        }
        return "Book[title=" + title + ", authors={" + authorList + "}, price=" + price + ", qty=" + qty + "]";
    }
}