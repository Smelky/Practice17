package model;

import beans.CustomBeanPostProcessor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.apache.log4j.Logger;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@EqualsAndHashCode
public class Message {

    private static Logger LOGGER = Logger.getLogger(CustomBeanPostProcessor.class);

    private String name;

    @PostConstruct
    public void init() {
        LOGGER.info("Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        LOGGER.info("Bean will be destroyed now");
    }
}
