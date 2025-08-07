import java.util.List;

public class GroupOfUsers {
    private String groupId;
    private String groupName;
    private List<User> users;

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
}
