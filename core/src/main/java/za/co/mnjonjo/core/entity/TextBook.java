package za.co.mnjonjo.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@Entity
@Table(name = "text_books")
public class TextBook implements Serializable {
    @Id
    @Column(name = "text_book_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "text_book_id_generator")
    @SequenceGenerator(name = "text_book_id_generator", sequenceName = "text_book_id_sequence", allocationSize = 1)
    private Long textBookId;
    @Column(name ="text_book_subject")
    private String textBookSubject;
}
