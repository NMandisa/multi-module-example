package za.co.mnjonjo.core.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Noxolo.Mkhungo
 */
@Configuration
@EnableTransactionManagement
@ImportResource({"classpath:/core-context.xml"})
public class CoreConfiguration {

    /*@Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }*/
}
