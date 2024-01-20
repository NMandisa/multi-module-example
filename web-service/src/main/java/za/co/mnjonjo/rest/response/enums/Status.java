package za.co.mnjonjo.rest.response.enums;

/**
 * @author Noxolo.Mkhungo
 */
public enum Status {
   ERROR(0), SUCCESS(1);
    private int num;
    Status(int num) {
        this.num = num;
    }
    public int getCode() {
        return num;
    }
}
