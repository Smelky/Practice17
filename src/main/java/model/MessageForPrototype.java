package model;

import beans.CustomBeanPostProcessor;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class MessageForPrototype {

    private static Logger LOGGER = Logger.getLogger(CustomBeanPostProcessor.class);

    @Bean(name = "prototype")
    @Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Message getPrototypeUser() {
        LOGGER.info("Prototype bean has been created");
        return new Message();
    }
}

