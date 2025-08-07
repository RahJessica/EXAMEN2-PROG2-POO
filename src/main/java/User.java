import java.time.LocalDate;
import java.util.Objects;

public abstract class User {
    private String userId;
    private String userName;
    private String email;
    private LocalDate createdAt;

    public User(String userId, String userName, String email, LocalDate createdAt) {
        this.userId = userId;
        this.userName = userName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    abstract Publication postPublication();
    abstract String commentPublication();
}
