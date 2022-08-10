package DesignComponents.Java.OverloadingVsOverriding.Overriding;

public class HumanBeing {

    public int walk(int distance, int time) {
        int speed = distance / time;
        speed = speed * 2;
        return speed;
    }
}
