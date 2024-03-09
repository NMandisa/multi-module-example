package za.co.mnjonjo.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Noxolo.Mkhungo
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TextBookDTO {
    private String name;
}
