package za.co.mnjonjo.common.facade;

import lombok.NonNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import za.co.mnjonjo.core.entity.Test;
import za.co.mnjonjo.core.repository.TestRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class TestFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestFacade.class.getName());
    private final @NonNull TestRepository testRepository;
    public TestFacade(@Validated TestRepository testRepository) {
        this.testRepository =  testRepository;
    }
    public List<Test> getALlTests(){
        return testRepository.findAll();
    }
}
