package za.co.mnjonjo.core.entity;

import jakarta.persistence.*;

import java.io.Serializable;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
@Table(name = "test")
public class Test implements Serializable {
    @Id
    @Column(name = "test_id")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "test_id_generator"
    )

    @SequenceGenerator(
            name = "test_id_generator",
            sequenceName = "test_id_sequence",
            allocationSize = 1
    )
    private Long testId;
    @Column(name ="subject")
    private String subject;
}
