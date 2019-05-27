package impls.gelly;

import interfaces.Transmission;

public class GellyTransmission implements Transmission {

    @Override
    public void putGear() {
        System.out.println("Эххх, шестой передачи не хватает");
    }
}
