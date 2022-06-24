package Java.DependencyInjection;

interface Person {

}

interface InjectPerson {
    public void injectHere(Person p);
}

class Company implements InjectPerson {
    Person injectedPerson;

    public void injectHere(Person p) {
        this.injectedPerson = p;
    }
}
