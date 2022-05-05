package chapter9;

public class Sports {
    private String name;
    private String modeOfPlaying;
    private String type;
    private int numberOfPlayers;
    private int age;

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sports(String name, String modeOfPlaying, String type, int numberOfPlayers, int age) {
        this.name = name;
        this.modeOfPlaying = modeOfPlaying;
        this.type = type;
        this.age = age;
        this.numberOfPlayers = numberOfPlayers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModeOfPlaying() {
        return modeOfPlaying;
    }

    public void setModeOfPlaying(String modeOfPlaying) {
        this.modeOfPlaying = modeOfPlaying;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
