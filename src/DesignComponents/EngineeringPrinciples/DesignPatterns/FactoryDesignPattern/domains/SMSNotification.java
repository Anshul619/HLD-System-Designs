package DesignComponents.EngineeringPrinciples.DesignPatterns.FactoryDesignPattern.domains;

import DesignComponents.EngineeringPrinciples.DesignPatterns.FactoryDesignPattern.interfaces.Notification;

public class SMSNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an SMS notification");
    }
}
