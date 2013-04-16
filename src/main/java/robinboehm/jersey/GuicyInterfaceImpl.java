package robinboehm.jersey;

public class GuicyInterfaceImpl implements GuicyInterface {

    public String get() {
        return GuicyInterfaceImpl.class.getName();
    }
}
