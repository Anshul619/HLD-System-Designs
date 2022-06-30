package DesignComponents.EngineeringPrinciples.DesignPatterns.FactoryDesignPattern;

import DesignComponents.EngineeringPrinciples.DesignPatterns.FactoryDesignPattern.interfaces.Notification;

/**
 *
 * 1. Define a factory method inside an interface.
 * 2. Let the subclass implements the above factory method and decide which object to create.
 * 3. In Java constructors are not polymorphic, but by allowing subclass to create an object, we are adding polymorphic behavior to the instantiation.
 * 4. In short, we are trying to achieve Pseudo polymorphism by letting the subclass decide what to create, and so this Factory method is also called as.
 *
 * Now let’s use factory class to create and get an object of concrete class by passing some information.
 */

public class NotificationService {
    public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("SMS");
        notification.notifyUser();
    }
}
