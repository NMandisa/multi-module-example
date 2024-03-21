package za.co.mnjonjo.core.elasticsearch;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import za.co.mnjonjo.core.elasticsearch.repository.TextBookIndexRepository;
import za.co.mnjonjo.core.repository.TextBookRepository;

/**
 * @author Noxolo.Mkhungo
 */
@Component
public class InitializeIndex {
    private final TextBookIndexRepository textBookIndexRepository;
    private final TextBookRepository textBookRepository;
    @Autowired
    public InitializeIndex(TextBookIndexRepository textBookIndexRepository,TextBookRepository textBookRepository){
        this.textBookIndexRepository=textBookIndexRepository;
        this.textBookRepository=textBookRepository;
    }
    @PostConstruct
    public void init(){
        textBookIndexRepository.saveAll(textBookRepository.findAll());
    }
}