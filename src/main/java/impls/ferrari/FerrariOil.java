package impls.ferrari;

import interfaces.Oil;
import org.springframework.stereotype.Component;

@Component
public class FerrariOil implements Oil {

    @Override
    public void refuel() {
        System.out.println("Надо на заправку");
    }
}
