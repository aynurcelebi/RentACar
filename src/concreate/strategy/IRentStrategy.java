package concreate.strategy;

import concreate.Car;
import concreate.Customer;

public interface IRentStrategy {
    void rentACar(Car car, Customer customer);
}
