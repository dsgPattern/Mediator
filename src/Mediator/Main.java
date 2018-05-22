package Mediator;

public class Main {

    public static void main(String[] args) {
        Conv conv1 = new Conv();
        User marcel = new User("Marcel", conv1);
        User ion = new User("Ion", conv1);
        User paul = new User("Paul", conv1);

        conv1.addUser(paul);
        conv1.addUser(ion);
        conv1.addUser(marcel);

        paul.sendMessage("Hello");
        marcel.sendMessage("Hello to you too");

    }
}
