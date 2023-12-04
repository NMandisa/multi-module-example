package za.co.mnjonjo.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.mnjonjo.core.entity.Test;

/**
 * @author Noxolo.Mkhungo
 */
@Repository("testRepository")
public interface TestRepository extends JpaRepository<Test,Long> {
}
