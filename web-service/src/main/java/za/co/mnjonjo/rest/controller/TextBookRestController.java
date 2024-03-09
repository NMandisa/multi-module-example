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
import za.co.mnjonjo.common.service.TextBookService;
import za.co.mnjonjo.rest.constants.TextBookRestURIConstants;
import za.co.mnjonjo.rest.constants.WebRestConstants;
import za.co.mnjonjo.rest.dto.TextBookDTO;
import za.co.mnjonjo.rest.response.GenericRestResponse;
import za.co.mnjonjo.rest.response.TextBookResponse;
import za.co.mnjonjo.rest.response.enums.Status;

import java.util.LinkedHashMap;
/**
 * @author Noxolo.Mkhungo
 */
@RequiredArgsConstructor
@CrossOrigin(allowedHeaders = {"*"}, origins = "*")
@RestController
@RequestMapping(TextBookRestURIConstants.TEXTBOOKS_REST_MAPPING)
@Tag(name = "Test")
public class TextBookRestController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TextBookRestController.class.getName());
    private final @NonNull TextBookService textBookService;
    @Operation(
            description = "Get endpoint for TextBook ",
            summary = "This is a summary for student management get endpoint list textbooks",
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
    @GetMapping(value = TextBookRestURIConstants.GET_ALL_TEXTBOOKS, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> list (){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS, Status.SUCCESS.getCode());
        restResponse.response().put("textbooks", textBookService.textBooks());
        return new ResponseEntity<>(restResponse,null, HttpStatus.ACCEPTED);
    }
    @PostMapping(value = TextBookRestURIConstants.CREATE_TEXTBOOK, consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity <GenericRestResponse> create(@RequestBody TextBookDTO textBookDTO){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("message","textbook created");
        restResponse.response().put("textbook", new TextBookResponse(textBookDTO.getName()));
        return new ResponseEntity<>(restResponse,null, HttpStatus.CREATED);
    }
    @PostMapping(value = TextBookRestURIConstants.GET_TEXTBOOK,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> getTestById(@PathVariable("id") Long testId){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("textbook","textbook-specific-textbook-using-id");
        return new ResponseEntity<>(restResponse,null, HttpStatus.OK);
    }
    @DeleteMapping(value = TextBookRestURIConstants.DELETE_TEXTBOOK,produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<GenericRestResponse> remove(@PathVariable("id") Long textBookId){
        GenericRestResponse restResponse = new GenericRestResponse(new LinkedHashMap<>());
        restResponse.response().put(WebRestConstants.STATUS,Status.SUCCESS.getCode());
        restResponse.response().put("delete","delete-textbook");
        return new ResponseEntity<>(restResponse,null, HttpStatus.ACCEPTED);
    }
}
