package za.co.mnjonjo.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
import za.co.mnjonjo.core.entity.Test;

/**
 * @author Noxolo.Mkhungo
 */
@NoRepositoryBean
public interface TestRepository extends JpaRepository<Test,Long> {
}
