package za.co.mnjonjo.core.entity.security;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import za.co.mnjonjo.core.entity.AbstractBase;

/**
 * @author Noxolo.Mkhungo
 */
@Getter
@Setter
@Entity
@AttributeOverride(name="id", column=@Column(name="role_id"))
public class Role extends AbstractBase {
}
