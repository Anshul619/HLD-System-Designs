package DesignComponents.Java.DependencyInjection.ConstructorInjection;

import DesignComponents.Java.DependencyInjection.ConstructorInjection.Interfaces.Service;

public class ServiceA implements Service {

    @Override
    public String getInfo() {
        return "ServiceB's Info";
    }
}
