package za.co.mnjonjo.core.elasticsearch;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.IndexOperations;
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
    private final ElasticsearchOperations elasticsearchOperations;
    private final IndexOperations indexOperations;
    @Autowired
    public InitializeIndex(TextBookIndexRepository textBookIndexRepository,TextBookRepository textBookRepository,ElasticsearchOperations elasticsearchOperations,IndexOperations indexOperations){
        this.textBookIndexRepository=textBookIndexRepository;
        this.textBookRepository=textBookRepository;
        this.elasticsearchOperations=elasticsearchOperations;
        this.indexOperations=indexOperations;
    }
    @PostConstruct
    public void init(){
        /*if(!indexOperations.exists()){
            indexOperations.create();
        }*/
        textBookIndexRepository.saveAll(textBookRepository.findAll());
    }
}