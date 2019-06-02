package pool;

import interfaces.Car;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;

@Component
public class CarPool implements interfaces.CarPool {

    private Map<String, Car> carCollection;

    public CarPool(Map<String, Car> carCollection) {
        super();
        this.carCollection = carCollection;
    }

    public void setCarCollection(Map<String, Car> carCollection) {
        this.carCollection = carCollection;
    }

    @Override
    public Map<String, Car> getCarCollections() {
        return carCollection;
    }
    public void action(){
      for (Map.Entry<String,Car> entry : carCollection.entrySet()) {
          System.out.println(entry.getKey());
          entry.getValue().go();
      }
   }
    //    private Collection<Car> carCollection;
//
//    public void setCarCollection(Collection<Car> carCollection) {
//        this.carCollection = carCollection;
//    }
//
//    public CarPool() {
//    }
//    public CarPool(Collection<Car> carCollection) {
//        this.carCollection = carCollection;
//    }
//
//    @Override
//    public Collection<Car> getCarCollections() {
//        return carCollection;
//    }
//
//
//
//    public void action(){
//      for (Car car:carCollection) {
//          car.go();
//      }
//    }
}
