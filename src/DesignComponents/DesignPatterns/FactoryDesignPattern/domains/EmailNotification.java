package DesignComponents.DesignPatterns.FactoryDesignPattern.domains;

import DesignComponents.DesignPatterns.FactoryDesignPattern.interfaces.Notification;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser()
    {
        // TODO Auto-generated method stub
        System.out.println("Sending an e-mail notification");
    }
}
