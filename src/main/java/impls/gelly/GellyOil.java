package impls.gelly;

import interfaces.Oil;

public class GellyOil implements Oil {

    @Override
    public void refuel() {
        System.out.println("Еще соточку проедим");
    }
}
