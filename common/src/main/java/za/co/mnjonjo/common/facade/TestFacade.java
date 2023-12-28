package za.co.mnjonjo.common.facade;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.mnjonjo.core.entity.Test;
import za.co.mnjonjo.core.repository.TestRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class TestFacade {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestFacade.class.getName());
    private TestRepository testRepository;
    @Autowired
    public void setTestRepository(TestRepository testRepository) {
        this.testRepository =  testRepository;
    }

    public List<Test> getALlTests(){
        return testRepository.findAll();
    }
}
