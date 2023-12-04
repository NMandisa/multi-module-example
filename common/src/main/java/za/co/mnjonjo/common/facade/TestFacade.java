package za.co.mnjonjo.common.facade;

import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.co.mnjonjo.core.entity.Test;
import za.co.mnjonjo.core.repository.TestRepository;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component("testFacade")
public class TestFacade {

    private final static Logger LOGGER = Logger.getLogger(TestFacade.class.getName());
    private TestRepository testRepository;
    @Autowired
    @Qualifier("testRepository")

    public void setTestRepository(TestRepository testRepository) {
        this.testRepository =  testRepository;
    }

    public List<Test> getALlTests(){
        return testRepository.findAll();
    }
}
