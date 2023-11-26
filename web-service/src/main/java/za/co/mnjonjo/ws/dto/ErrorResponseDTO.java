package za.co.mnjonjo.ws.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

/**
 * @author Noxolo.Mkhungo
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ErrorResponseDTO {
    private LocalDateTime timestamp;
    private String message;
    private String details;

}
