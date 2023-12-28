package za.co.mnjonjo.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class CommonApp
{
    private final static Logger LOGGER = LoggerFactory.getLogger(CommonApp.class.getName());
    public static void main( String[] args )
    {
        LOGGER.debug("Initializing Spring Mnjonjo Common context.", CommonApp.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/common-context.xml");
    }
}
