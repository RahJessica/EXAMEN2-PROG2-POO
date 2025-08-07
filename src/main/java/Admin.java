import java.time.LocalDate;

public abstract class Admin extends User{

    public Admin(String userId, String userName, String email, LocalDate createdAt) {
        super(userId, userName, email, createdAt);
    }
}
