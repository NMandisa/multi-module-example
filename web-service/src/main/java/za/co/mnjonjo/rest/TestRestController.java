package za.co.mnjonjo.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import za.co.mnjonjo.common.service.TestService;
import za.co.mnjonjo.rest.constant.RestURIConstants;
import za.co.mnjonjo.rest.dto.TestDTO;
import za.co.mnjonjo.rest.response.TestResponse;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author Noxolo.Mkhungo
 */
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(RestURIConstants.TESTS_REST_MAPPING)
public class TestRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRestController.class.getName());
    private final @NonNull TestService testService;
    public TestRestController (@Validated TestService testService)
    { this.testService=testService;}

    @GetMapping(value = RestURIConstants.GET_ALL_TESTS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> list (){
        LOGGER.debug("Test ............");
        Map< String, Object > response= new LinkedHashMap<>();
        response.put("status",1);
        response.put("tests","[]");
        return new ResponseEntity<>(response,null, HttpStatus.ACCEPTED);
    }
    @PostMapping(value = RestURIConstants.CREATE_TEST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <?> create(@RequestBody TestDTO testDTO){
        Map< String, Object > response= new LinkedHashMap<>();
        response.put("status",1);
        response.put("message","test created");
        response.put("test", new TestResponse(testDTO.getName()));
        return new ResponseEntity<>(response,null, HttpStatus.CREATED);
    }
    @PostMapping(value = RestURIConstants.GET_TEST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getTestById(@PathVariable("test-id") Long testId){
        Map< String, Object > response= new LinkedHashMap<>();
        response.put("status",1);
        response.put("test","tests-specific-test-using-id");
        return new ResponseEntity<>(response,null, HttpStatus.OK);
    }
    @DeleteMapping(value = RestURIConstants.DELETE_TEST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> remove(@PathVariable("test-id") Long testId){
        Map< String, Object > response= new LinkedHashMap<>();
        response.put("status",1);
        response.put("delete","delete-test");
        return new ResponseEntity<>(response,null, HttpStatus.ACCEPTED);
    }
}
