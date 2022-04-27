package chapter8;

public enum People {
    WORM("Amaka"),
    DEJI(),
    BUNMI("Love","joy");


    private  String[] boyFriendName;
    People(String name){
        boyFriendName = new String[1];
        boyFriendName[0] = name;
    }
    People(String...names){
        boyFriendName = names;
    }

}
