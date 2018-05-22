package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Conv implements IConv {
    private List<User> users =  new ArrayList<>();

    @Override
    public void sendMessage(String emitator, String text) {
        users.stream().filter(user -> !user.getName().equals(emitator))
                .forEach(user -> user.recieveMessage(text));
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

}
