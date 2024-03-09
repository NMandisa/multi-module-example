package za.co.mnjonjo.rest.constants;

/**
 * @author Noxolo.Mkhungo
 */
public class TextBookRestURIConstants {
    private TextBookRestURIConstants() {}
    public static final String TEXTBOOKS_REST_MAPPING = "/api/v1/textbooks";
    public static final String GET_ALL_TEXTBOOKS = "/";
    public static final String GET_TEXTBOOK = "/{id}";
    public static final String CREATE_TEXTBOOK = "/create";
    public static final String DELETE_TEXTBOOK = "/delete/{id}";
}
