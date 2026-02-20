public class AuthorApp {
    public static void main(String[] args) {
        Author osman = new Author("Richard Osman", "noone@nowhere.com", 'm');
        System.out.println(osman); 
        osman.setEmail("osman@murderclub.com"); 
        System.out.println("name is: " + osman.getName()); 
        System.out.println("email is: " + osman.getEmail()); 
        System.out.println("gender is: " + osman.getGender()); 
    }
}