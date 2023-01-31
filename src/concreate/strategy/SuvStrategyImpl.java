package concreate.strategy;

import concreate.Car;
import concreate.Customer;

public class SuvStrategyImpl implements IRentStrategy {
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("SUV Kiralama");
    }

}
