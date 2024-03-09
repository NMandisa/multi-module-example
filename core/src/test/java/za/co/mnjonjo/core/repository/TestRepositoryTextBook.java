package za.co.mnjonjo.core.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import za.co.mnjonjo.core.entity.TextBook;

import java.util.List;

/**
 * @author Noxolo.Mkhungo
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration("classpath:/META-INF/core-context.xml")
@Rollback
@ActiveProfiles("dev")
 class TestRepositoryTextBook {
    private final TextBookRepository textBookRepository;
    @Autowired
    public TestRepositoryTextBook(TextBookRepository textBookRepository) {
        this.textBookRepository = textBookRepository;
    }

    @BeforeEach
     void cleanup() {
        textBookRepository.deleteAll();
    }
    @Test
     void testSave() {
        TextBook textBook = new TextBook();
        textBook.setTextBookSubject("Computer Application Technology");
        textBookRepository.save(textBook);
        List<TextBook> result = textBookRepository.findAll();
        Assertions.assertTrue(result.contains(textBook));
    }
}