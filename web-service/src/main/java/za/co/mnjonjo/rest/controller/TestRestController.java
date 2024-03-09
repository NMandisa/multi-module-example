package za.co.mnjonjo.rest.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;
import za.co.mnjonjo.common.service.TestService;
import za.co.mnjonjo.rest.constant.RestURIConstants;
import za.co.mnjonjo.rest.constant.WebRestConstants;
import za.co.mnjonjo.rest.dto.TestDTO;
import za.co.mnjonjo.rest.response.GenericRestResponse;
import za.co.mnjonjo.rest.response.TestResponse;
import za.co.mnjonjo.rest.response.enums.Status;

import java.util.LinkedHashMap;
/**
 * @author Noxolo.Mkhungo
 */
@RequiredArgsConstructor
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(RestURIConstants.TESTS_REST_MAPPING)
@Tag(name = "Test")
public class TestRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestRestController.class.getName());
    private final @NonNull TestService testService;
    @Operation(
            description = "Get endpoint for Test ",
            summary = "This is a summary for student management get endpoint list test",
            responses = {
                    @ApiResponse(
                            description = "Success",
                            responseCode = "200"
                    ),
                    @ApiResponse(
                            description = "Unauthorized",
                            responseCode = "403"
                    )
            }
    )
    @GetMapping(value = RestURIConstants.GET_ALL_TESTS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> list (){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS, Status.SUCCESS.getCode());
        restResponse.response().put("tests",testService.testList());
        return new ResponseEntity<>(restResponse,null, HttpStatus.ACCEPTED);
    }
    @PostMapping(value = RestURIConstants.CREATE_TEST, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <GenericRestResponse> create(@RequestBody TestDTO testDTO){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("message","test created");
        restResponse.response().put("test", new TestResponse(testDTO.getName()));
        return new ResponseEntity<>(restResponse,null, HttpStatus.CREATED);
    }
    @PostMapping(value = RestURIConstants.GET_TEST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> getTestById(@PathVariable("test-id") Long testId){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("test","tests-specific-test-using-id");
        return new ResponseEntity<>(restResponse,null, HttpStatus.OK);
    }
    @DeleteMapping(value = RestURIConstants.DELETE_TEST,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> remove(@PathVariable("test-id") Long testId){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("delete","delete-test");
        return new ResponseEntity<>(restResponse,null, HttpStatus.ACCEPTED);
    }
}
