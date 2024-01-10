package za.co.mnjonjo.web;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Noxolo.Mkhungo
 */
@Controller
public class ErrorController {
    @GetMapping(value = "/error")
    public ModelAndView renderErrorPage(HttpServletRequest httpRequest) {
        ModelAndView errorPage = new ModelAndView("error");//
        String message = "";
        int httpErrorCode = getErrorCode(httpRequest);

        switch (httpErrorCode) {
            case 400: {
                message = "Bad Request";
                break;
            }
            case 401: {
                message = "Unauthorized";
                break;
            }
            case 404: {
                message = "Resource not found";
                break;
            }
            case 500: {
                message = "Internal Server Error";
                break;
            }
        }
        errorPage.addObject("message", message);
        return errorPage;
    }

    private int getErrorCode(HttpServletRequest httpRequest) {
        return (Integer) httpRequest.getAttribute("jakarta.servlet.error.status_code");
    }
}
