package za.co.mnjonjo.common.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import za.co.mnjonjo.common.facade.TestFacade;
import za.co.mnjonjo.core.entity.Test;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
public class TestService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestService.class.getName());
    private final @NonNull TestFacade testFacade;
    public TestService(@Validated TestFacade testFacade) {
        this.testFacade =  testFacade;
    }

    public List<Test> testList(){
        return testFacade.getALlTests();
    }
}
