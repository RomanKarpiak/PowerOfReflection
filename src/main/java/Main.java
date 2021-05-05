import com.roman.Twitter;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] arg){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
          context.getBean(Twitter.class).sayQuote();

    }
}
