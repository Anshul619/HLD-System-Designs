package DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.domains;

import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.Interface.Notification;

public class PushNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending a push notification");
    }
}
