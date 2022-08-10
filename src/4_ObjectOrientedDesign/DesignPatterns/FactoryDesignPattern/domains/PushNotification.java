package DesignComponents.DesignPatterns.FactoryDesignPattern.domains;

import DesignComponents.DesignPatterns.FactoryDesignPattern.interfaces.Notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}
