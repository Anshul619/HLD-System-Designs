package DesignLLDProblems.SnackAndLadderGame.domains;

public class User {
    String name;
    public int position;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, int position) {
        this.name = name;
        this.position = position;
    }
}