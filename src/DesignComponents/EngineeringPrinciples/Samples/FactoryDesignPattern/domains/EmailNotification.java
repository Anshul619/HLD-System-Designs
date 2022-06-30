package DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.domains;

import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.Interface.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}
