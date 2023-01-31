package concreate.strategy;

import concreate.Car;
import concreate.Customer;

public class SedanSatrategyImpl implements IRentStrategy{
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("SEDAN Kiralama");
    }
}
