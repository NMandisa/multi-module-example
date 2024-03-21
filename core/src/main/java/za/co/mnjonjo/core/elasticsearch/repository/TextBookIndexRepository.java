package za.co.mnjonjo.core.elasticsearch.repository;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import za.co.mnjonjo.core.entity.TextBook;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface TextBookIndexRepository extends ElasticsearchRepository<TextBook,Long> {
}