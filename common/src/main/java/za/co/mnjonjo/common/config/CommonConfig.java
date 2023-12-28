package za.co.mnjonjo.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Noxolo.Mkhungo
 */
@EnableAsync
@Configuration
@EnableJpaRepositories(basePackages = {"za.co.mnjonjo.core.repository"})
@ImportResource({"classpath:/common-context.xml"})
public class CommonConfig {
}
