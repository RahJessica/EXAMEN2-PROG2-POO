import java.time.LocalDate;

public abstract class Moderator extends User{

    public Moderator(String userId, String userName, String email, LocalDate createdAt) {
        super(userId, userName, email, createdAt);
    }


}
