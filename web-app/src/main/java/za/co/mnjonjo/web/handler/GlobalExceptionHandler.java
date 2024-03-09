package za.co.mnjonjo.web.handler;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 * @author Noxolo.Mkhungo
 */
@ControllerAdvice(annotations = Controller.class)
public class GlobalExceptionHandler {
    @ExceptionHandler(NullPointerException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//500
    public ModelAndView handleNullPointerException(Exception ex) {
        ModelAndView model = new ModelAndView("error-specific");
        model.addObject("cause", ex.getCause());
        model.addObject("message", ex.getLocalizedMessage());
        model.addObject("trace", ex.getStackTrace());
        return model;
    }
    @ExceptionHandler(value = {SQLException.class, SQLDataException.class})
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)//500
    public ModelAndView handleSQLExceptionAndSQLDataException(Exception ex) {
        ModelAndView model = new ModelAndView("error-specific");
        model.addObject("cause", ex.getCause());
        model.addObject("message", ex.getLocalizedMessage());
        model.addObject("trace", ex.getStackTrace());
        return model;
    }
}
