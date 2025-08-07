import java.time.LocalDate;

public class Admin extends User{

    public Admin(String userId, String userName, String email, LocalDate createdAt) {
        super(userId, userName, email, createdAt);
    }

    @Override
    Publication postPublication() {
        return null;
    }

    @Override
    String commentPublication() {
        return "";
    }
}
