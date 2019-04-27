package singleton;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MessageRunnerForSingleton {
    private static final Logger LOGGER = Logger.getLogger(MessageRunnerForSingleton.class);

    public static void messageRun() {
        ApplicationContext context =
                new FileSystemXmlApplicationContext("classpath:message-bean-singleton.xml");

        MessageForSingleton message = (MessageForSingleton) context.getBean("printMessage");
        message.setMessage("This is first object.");
        LOGGER.info(message.getMessage());

        MessageForSingleton oneMoreMessage = (MessageForSingleton) context.getBean("printMessage");
        LOGGER.info(oneMoreMessage.getMessage());
    }
}
