package za.co.mnjonjo.core.entity.security;

import jakarta.persistence.*;

/**
 * @author Noxolo.Mkhungo
 */
@Entity
public class Role {
    @Id
    @SequenceGenerator(name = "role_generator", sequenceName = "sequence_role_id", allocationSize = 10, initialValue = 10101)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_generator")
    @Column(name = "role_id")
    private long roleId;
}
