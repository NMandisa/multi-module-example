package za.co.mnjonjo.common.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import za.co.mnjonjo.core.repository.TestRepository;
import za.co.mnjonjo.core.utils.SpringUtil;

import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class TestFacade {

    private final static Logger LOGGER = Logger.getLogger(TestFacade.class.getName());
    private TestRepository testRepository;
    @Autowired
    @Qualifier("testRepository")
    public void setTestRepository(TestRepository testRepository) {
        this.testRepository =  testRepository;
    }
}
