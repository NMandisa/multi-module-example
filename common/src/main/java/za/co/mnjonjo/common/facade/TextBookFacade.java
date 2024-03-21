package za.co.mnjonjo.common.facade;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import za.co.mnjonjo.core.entity.TextBook;
import za.co.mnjonjo.core.repository.TextBookRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Component
@Scope("singleton")
public class TextBookFacade {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextBookFacade.class.getName());
    private final TextBookRepository textBookRepository;
    @Autowired
    public TextBookFacade(TextBookRepository textBookRepository){
        this.textBookRepository=textBookRepository;
    }
    public List<TextBook> getALLTextBooks(){return textBookRepository.findAll();}
}
