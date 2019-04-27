package beans;

import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class PersonEntity implements BeanPostProcessor {

    private static Logger LOGGER = Logger.getLogger(PersonEntity.class);

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof PersonEntity) {
            LOGGER.info("In postProcessAfterInitialization " + bean);
        }
        return bean;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof PersonEntity) {
            LOGGER.info("In postProcessBeforeInitialization " + bean);
        }
        return bean;
    }

    @PostConstruct
    public void init() {
        LOGGER.info("Person is init!");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("Person is destroy!");
    }
}
