public class BookApp {
    public static void main(String[] args) {
        Author[] authors = {
            new Author("Pip Jones", "pjones@java.org", 'u'),
            new Author("Bessie Carter", "b.carter@java.org", 'f')
        };
        Book javaDummy = new Book("Java for Dummies", authors, 19.99, 99);
        System.out.println(javaDummy); 
    }
}