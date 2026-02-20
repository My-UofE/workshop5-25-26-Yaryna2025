public class StringFormatApp {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        float height = Float.parseFloat(args[2]);
        
        System.out.printf("name: %-20s Age:%3d Height:%4.2fm%n", name, age, height);
        
        float spaceHeight = height * 1.023f * 100;
        System.out.printf("My space height would be %.1fcm%n", spaceHeight);
        
        int martianAge = Math.round(age / 1.88f);
        System.out.printf("On Mars I would be approximately %d years old.%n", martianAge);
    }
}