import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.bondary.service.Utils;

public class App {


    public static void main(String[] args) {
        System.out.println("Hello");

        ApplicationContext beanFactory = new ClassPathXmlApplicationContext("context.xml");

        Utils utils = (Utils) beanFactory.getBean("utils");
        System.out.println(utils.power(2,2));

    }
}
