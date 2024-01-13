package za.co.mnjonjo.common.facade;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mnjonjo.core.entity.Test;
import za.co.mnjonjo.core.repository.TestRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
@RequiredArgsConstructor
public class TestFacade {

    private static final Logger LOGGER = LoggerFactory.getLogger(TestFacade.class.getName());
    private final @NonNull TestRepository testRepository;
    public List<Test> getALlTests(){return testRepository.findAll();}
}
