package DesignComponents.Java.DependencyInjection.InterfaceInjection;

class Company implements InjectPerson {
    Person injectedPerson;

    public void injectHere(Person p) {
        this.injectedPerson = p;
    }
}
