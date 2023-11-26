package za.co.mnjonjo.ws;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController("/tests")
public class TestRestController {

    private final static Logger LOGGER = Logger.getLogger(TestRestController.class.getName());
    @RequestMapping(value = "/")
    public ResponseEntity<?> testapi(){
        LOGGER.log(Level.INFO,"Test Rest Controller",TestRestController.class.getName());
        Model model = null;
        model.addAttribute("message","Hello World");
        return new ResponseEntity<>(model,HttpStatus.OK);
    }

}
