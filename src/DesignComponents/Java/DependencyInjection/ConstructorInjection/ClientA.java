package DesignComponents.Java.DependencyInjection.ConstructorInjection;

import DesignComponents.Java.DependencyInjection.ConstructorInjection.Interfaces.Client;
import DesignComponents.Java.DependencyInjection.ConstructorInjection.Interfaces.Service;

/**
 * The class ClientA is now NOT depending on any specific implementations of Service.
 * - Instead of creating an instance of dependent class directly in ClientA, the dependency injection container or framework is now responsible for creating that instance and inject it to the class ClientA via its constructor.
 */
public class ClientA implements Client {

    Service service;

    // Constructor Injection
    public ClientA(Service service) {
        this.service = service;
    }

    @Override
    public void doSomething() {
        String info = service.getInfo();
    }
}
