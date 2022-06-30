package DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern;

import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.Interface.Notification;
import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.domains.EmailNotification;
import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.domains.PushNotification;
import DesignComponents.EngineeringPrinciples.Samples.FactoryDesignPattern.domains.SMSNotification;

/**
 * Create a factory class NotificationFactory.java to instantiate concrete class.
 */

public class NotificationFactory {
    public Notification createNotification(String channel)
    {
        if (channel == null || channel.isEmpty())
            return null;

        switch (channel) {
            case "SMS":
                return new SMSNotification();
            case "EMAIL":
                return new EmailNotification();
            case "PUSH":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Unknown channel "+channel);
        }
    }
}
