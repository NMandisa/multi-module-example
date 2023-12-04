package za.co.mnjonjo.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import za.co.mnjonjo.common.facade.TestFacade;
import za.co.mnjonjo.core.entity.Test;

import java.util.List;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@Service("testService")
public class TestService {
    private final static Logger LOGGER = Logger.getLogger(TestService.class.getName());
    private TestFacade testFacade;
    @Autowired
    @Qualifier("testFacade")
    public void setTestFacade(TestFacade testFacade) {
        this.testFacade =  testFacade;
    }

    public List<Test> testList(){
        return testFacade.getALlTests();
    }
}
