package Java.DependencyInjection;

import Java.DependencyInjection.Interfaces.Service;

public class ServiceA implements Service {

    @Override
    public String getInfo() {
        return "ServiceB's Info";
    }
}
