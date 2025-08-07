import java.time.LocalDate;

public class Moderator extends User{

    public Moderator(String userId, String userName, String email, LocalDate createdAt) {
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

    @Override
    String postComment(String comment) {
        return comment;
    }


}
