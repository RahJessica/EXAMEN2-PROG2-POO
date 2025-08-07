import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GroupOfUsers {
    private String groupId;
    private String groupName;
    private static List<User> users;

    public GroupOfUsers(String groupId, String groupName, List<User> users) {
        this.groupId = groupId;
        this.groupName = groupName;
        this.users = users;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public List<User> getUsers() {
        return users;
    }

    public static User searchUser(String userName) {
        for (User user : users) {
            if (user.getUserName().equals(userName)) {
                return user;
            } else {
                System.out.println("User not found");
            }
        }
        return null;
    }

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        User user1 = new Moderator("MEMBRE-01", "Liam", "liam@gmail.com", LocalDate.now());
        userList.add(user1);
        GroupOfUsers group1 = new GroupOfUsers("group1", "Dev mada", userList);
        group1.users.add(user1);

        System.out.println(searchUser("Liam"));
    }
}
