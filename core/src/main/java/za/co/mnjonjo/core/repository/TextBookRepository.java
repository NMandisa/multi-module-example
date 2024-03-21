package za.co.mnjonjo.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.mnjonjo.core.entity.TextBook;

/**
 * @author Noxolo.Mkhungo
 */
@Repository
public interface TextBookRepository extends JpaRepository<TextBook,Long> {
}
