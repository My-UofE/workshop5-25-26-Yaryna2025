class Apple {
    public String color;

    public Apple(String color){
        this.color = color;
    }
}

public class PassByValueApp {

    public static void main(String[] args){

        Apple myApple = new Apple("red");

        System.out.println("myApple: " + myApple); 
        System.out.println("Before the method: " + myApple.color);

        changeAppleColor(myApple);

        System.out.println("After the method: " + myApple.color);
    }

    // Final version
    public static void changeAppleColor(Apple apple){

        System.out.println("apple: " + apple);

        apple = new Apple("blue");  
        System.out.println("apple: " + apple);

        apple.color = "green";       
    }
}