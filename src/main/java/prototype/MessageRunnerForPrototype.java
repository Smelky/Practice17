package prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunnerForPrototype {
    public static void messageRun() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:message-bean-prototype.xml");

        MessageForPrototype message = (MessageForPrototype) context.getBean("printMessage");
        message.setMessage("This is first object.");
        System.out.println(message.getMessage());

        MessageForPrototype oneMoreMessage = (MessageForPrototype) context.getBean("printMessage");
        System.out.println(oneMoreMessage.getMessage());
    }
}
