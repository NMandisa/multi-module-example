package za.co.mnjonjo.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.Indexed;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@Entity
@Table(name = "text_books")
@AttributeOverride(name="id", column=@Column(name="text_book_id"))
public class TextBook extends AbstractBase implements Serializable {
    @Field
    @Indexed(name = "subject", type = "string")
    @Column(name ="text_book_subject")
    private String textBookSubject;
}
