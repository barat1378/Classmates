package sqlite.info;
import events.MyEvent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
@SpringBootApplication
public class InfoApplication {

    public static void main(String[] args) {
        ApplicationContext context=SpringApplication.run(InfoApplication.class, args);
        context.publishEvent(new MyEvent("Hello How are you?"));
    }
}
