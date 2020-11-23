package Servlets;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Helper {

    public static List<User> users = new ArrayList<>();
    public static User currentUser;

    boolean checkCredo (String user, String password) {
// to do
        Stream correct = Helper.users.stream().filter(person -> person.getPassword().equals(password) && person.getLogin().equals(user));
        if(correct.count() == 1) {
            return true;
        } else {
            return false;
        }
    }

    User getUserInfo(String login) {
        Optional<User> userObject = Helper.users.stream().
                filter(person -> person.getLogin().equals(login)).
                findFirst();
        //null
        return userObject.get();
    }

}
