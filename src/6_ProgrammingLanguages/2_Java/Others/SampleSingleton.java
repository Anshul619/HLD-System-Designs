package DesignComponents.Java.Others;

public class SampleSingleton {

    private int waterQuantity = 500;
    private SampleSingleton(){}
    private static SampleSingleton object = null;

    // Method to provide the service of Giving Water.
    public int getWater(int quantity){
        waterQuantity -= quantity;
        return quantity;
    }

    // Method to return the object to the user.
    public static SampleSingleton getInstance(){
        // Will Create a new object if the object is not already created and return the object.
        if(object == null){
            object = new SampleSingleton();
        }
        return object;
    }

    public static void main(String[] args) {

        // Singleton object
        SampleSingleton glass1 = SampleSingleton.getInstance();
        glass1.getWater(1);
    }
}
