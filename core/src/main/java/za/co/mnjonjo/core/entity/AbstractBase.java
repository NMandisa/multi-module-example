package za.co.mnjonjo.core.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@MappedSuperclass
public abstract class AbstractBase {
    @Id
    @SequenceGenerator(name = "id_generator", sequenceName = "sequence_id", allocationSize = 10, initialValue = 201)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @Column(name = "id")
    protected long id;
}
