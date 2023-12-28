package za.co.mnjonjo.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    private final static Logger LOGGER = LoggerFactory.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        LOGGER.debug("Initializing Spring context.", App.class);
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/core-context.xml");
        LOGGER.debug(applicationContext.getBean("testRepository").toString());
    }
}
