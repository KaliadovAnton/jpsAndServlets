package anton;

import java.util.ArrayList;

public class User {
    private final String name;
    private static final ArrayList<User> users = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void writeDownUser(String name) {
        users.add(new User(name));
    }

    public static String getUserName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) return user.getName();
        }
        writeDownUser(name);
        return name;
    }
}
