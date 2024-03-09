package za.co.mnjonjo.rest.handler;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.AccessDeniedException;
import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * @author Noxolo.Mkhungo
 */
@RestControllerAdvice(annotations ={RestController.class})
@Order(Ordered.HIGHEST_PRECEDENCE)
public class GlobalRestExceptionHandler {
    @ExceptionHandler(value = {SQLException.class, ArithmeticException.class, SQLDataException.class})
    @ResponseBody
    public final ResponseEntity<?> handleSQLDataException(Exception ex) {
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);//500
    }
    @ExceptionHandler(value = { IllegalArgumentException.class, IllegalStateException.class })
    @ResponseBody
    public final ResponseEntity<?> handleConflict(Exception ex) {
        return new ResponseEntity<>(ex, HttpStatus.INTERNAL_SERVER_ERROR);//409
    }
    @ExceptionHandler({ AccessDeniedException.class })
    @ResponseBody
    public final ResponseEntity<?> handleAccessDeniedException(Exception ex) {
        return new ResponseEntity<>(ex, HttpStatus.FORBIDDEN);//403
    }

}
