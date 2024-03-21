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
@Table(name = "user")
@AttributeOverride(name="id", column=@Column(name="user_id"))
public class User extends AbstractBase {
}