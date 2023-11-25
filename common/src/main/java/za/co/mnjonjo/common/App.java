package za.co.mnjonjo.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import za.co.mnjonjo.core.utils.SpringUtil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App
{
    private final static Logger LOGGER = Logger.getLogger(za.co.mnjonjo.common.App.class.getName());
    public static void main( String[] args )
    {
        LOGGER.log(Level.INFO,"Initializing Spring Mnjonjo Common context.", za.co.mnjonjo.common.App.class);
        SpringUtil springUtil =new SpringUtil();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/core-context.xml");
        springUtil.setApplicationContext(applicationContext);
    }
}
