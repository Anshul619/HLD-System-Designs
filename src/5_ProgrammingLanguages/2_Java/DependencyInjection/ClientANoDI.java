package DesignComponents.Java.DependencyInjection;

import DesignComponents.Java.DependencyInjection.ConstructorInjection.ServiceA;

/**
 * Here ClientANoDI is dependent on ServiceA.
 *
 * But here `ServiceA` is hardcoded.
 * - Instead, we can inject ServiceA as a dependency in the constructor, to make it loosely coupled code.
 * - See `ClientA` as an example.
 */
public class ClientANoDI {
    ServiceA service;

    public void doSomething() {
        String info = service.getInfo();
    }
}
