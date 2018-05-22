package Mediator;

class User {

    private String name;
    private IConv conv;

    User(String name, IConv conv) {
        this.name = name;
        this.conv = conv;
    }


    void sendMessage(String text){
        System.out.println(this.name + " has sent the following message: '"
                + text + "'");
        conv.sendMessage(this.name,text);
    };

    void recieveMessage(String text){
        System.out.println(this.name + " has received the following message: '"
                + text + "'");
    };

    String getName() {
        return name;
    }
}
