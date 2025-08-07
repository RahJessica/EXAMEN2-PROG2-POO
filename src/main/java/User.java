import java.time.LocalDate;

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

    abstract Publication postPublication();
    abstract String commentPublication();
}
