package model;

import beans.CustomBeanPostProcessor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MessageForSingleton {

    private static Logger LOGGER = Logger.getLogger(CustomBeanPostProcessor.class);

    @Bean(name = "singleton")
    public Message getPrototypeUser() {
        LOGGER.info("Singleton bean has been created");
        return new Message();
    }
}