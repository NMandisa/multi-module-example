package za.co.mnjonjo.common.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import za.co.mnjonjo.common.facade.TextBookFacade;
import za.co.mnjonjo.core.entity.TextBook;
import za.co.mnjonjo.core.repository.TextBookRepository;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@Service
@Scope("singleton")
public class TextBookService {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextBookService.class.getName());
    private final TextBookFacade textBookFacade;
    @Autowired
    public TextBookService(@Qualifier("defaultTextBookFacade") TextBookFacade textBookFacade){
        this.textBookFacade=textBookFacade;
    }
    public List<TextBook> textBooks(){
        return textBookFacade.getALLTextBooks();
    }
}
