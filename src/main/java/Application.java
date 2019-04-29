import model.Message;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = {"model", "beans"})
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.mateacademy.springintro");

        Message message = context.getBean("prototype", Message.class);
        Message MessagePrototype = context.getBean("prototype", Message.class);

        Message singleton = context.getBean("singleton", Message.class);
        Message other = context.getBean("singleton", Message.class);

        Runtime.getRuntime().addShutdownHook(new Thread(context::close));
    }
}
