import java.util.ArrayList;

public class BookShopApp {
    public static void main(String[] args) {

        ArrayList<Book> stocklist = new ArrayList<>();

        Author[] authors1 = {new Author("Robert Nisbet", "", 'u')};
        Book book1 = new Book("Data Mining Handbook", authors1, 27.95, 10);
        stocklist.add(book1);

        Author[] authors2 = {new Author("Roger Hutty", "", 'u')};
        Book book2 = new Book("Mastering COBOL", authors2, 4.95, 10);
        stocklist.add(book2);

        Author[] authors3 = {new Author("Paul Murrill", "", 'u')};
        Book book3 = new Book("Intro to COBOL", authors3, 7.35, 4);
        stocklist.add(book3);

        Author[] authors4 = {new Author("Andy Oram", "", 'u')};
        Book book4 = new Book("Making Software", authors4, 35.00, 5);
        stocklist.add(book4);

        Author[] authors5 = {new Author("James Nino", "", 'u'), new Author("Frederick Hosch", "", 'u')};
        Book book5 = new Book("OO Design Using Java", authors5, 30.00, 6);
        stocklist.add(book5);

        Author[] authors6 = {new Author("David Barnes", "", 'u'), new Author("Michael Kolling", "", 'u')};
        Book book6 = new Book("Objects First with Java", authors6, 29.50, 4);
        stocklist.add(book6);

        System.out.println("| Title                   | Authors                       |  Price | Qty |");
        System.out.println("---------------------------------------------------------------");
        for (Book b : stocklist) {
            String authorList = "";
            for (int i = 0; i < b.getAuthors().length; i++) {
                authorList += b.getAuthors()[i].getName();
                if (i < b.getAuthors().length - 1) authorList += ", ";
            }
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",
                              b.getTitle(), authorList, b.getPrice(), b.getQty());
        }

        String searchFor = "making software";
        System.out.println("\nSearch for term(s) '" + searchFor + "' in title...");
        for (Book b : stocklist) {
            if (b.getTitle().toLowerCase().equals(searchFor.toLowerCase())) {
                System.out.println("Found book: " + b);
                b.setQty(b.getQty() - 1);
            }
        }

        System.out.println("\nUpdated stocklist:");
        for (Book b : stocklist) {
            String authorList = "";
            for (int i = 0; i < b.getAuthors().length; i++) {
                authorList += b.getAuthors()[i].getName();
                if (i < b.getAuthors().length - 1) authorList += ", ";
            }
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",
                              b.getTitle(), authorList, b.getPrice(), b.getQty());
        }

        String removeAll = "cobol";
        System.out.println("\nRemoving all books with term '" + removeAll + "' in title...");
        int removedCount = 0;
        for (int i = stocklist.size() - 1; i >= 0; i--) { 
            if (stocklist.get(i).getTitle().toLowerCase().contains(removeAll.toLowerCase())) {
                removedCount++;
                stocklist.remove(i);
            }
        }
        System.out.println("Removed " + removedCount + " books");

        System.out.println("\nFinal stocklist:");
        for (Book b : stocklist) {
            String authorList = "";
            for (int i = 0; i < b.getAuthors().length; i++) {
                authorList += b.getAuthors()[i].getName();
                if (i < b.getAuthors().length - 1) authorList += ", ";
            }
            System.out.printf("| %-23s | %-28s | %6.2f | %03d |\n",
                              b.getTitle(), authorList, b.getPrice(), b.getQty());
        }
    }
}