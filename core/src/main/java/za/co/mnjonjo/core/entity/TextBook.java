package za.co.mnjonjo.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Setter
@Getter
@Entity
@Table(name = "text_books")
@Document(indexName = "text_book_index")
public class TextBook extends AbstractBase implements Serializable {

    @AttributeOverride(name="id", column=@Column(name="text_book_id"))

    @Field(type = FieldType.Text, name = "text_book_subject")
    @Column(name ="text_book_subject")
    private String textBookSubject;
}
