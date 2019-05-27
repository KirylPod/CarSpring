package impls.ferrari;

import interfaces.Oil;

public class FerrariOil implements Oil {

    @Override
    public void refuel() {
        System.out.println("Надо на заправку");
    }
}
