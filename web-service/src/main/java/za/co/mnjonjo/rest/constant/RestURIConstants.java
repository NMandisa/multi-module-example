package za.co.mnjonjo.rest.constant;

/**
 * @author Noxolo.Mkhungo
 */
public class RestURIConstants {
    private RestURIConstants() {}
    public static final String TESTS_REST_MAPPING = "/api/v1/tests";
    public static final String GET_ALL_TESTS = "/";
    public static final String GET_TEST = "/{test-id}";
    public static final String CREATE_TEST = "/create";
    public static final String DELETE_TEST = "/delete/{test-id}";
}
