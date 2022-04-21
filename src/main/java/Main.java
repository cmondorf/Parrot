import org.springframework.context.annotation.AnnotationConfigApplicationContext; // this import step is not in the book

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(); // creates an instance in the Spring context
        Parrot p = new Parrot();
    }
}
