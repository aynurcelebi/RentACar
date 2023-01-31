package concreate;

import concreate.strategy.IRentStrategy;

public class RentCarImpl implements IRentCar{

    IRentStrategy iRentStrategy;
    @Override
    public void rentACar(Car car, Customer customer) {
        iRentStrategy.rentACar(car,customer);
    }
    public RentCarImpl(IRentStrategy iRentStrategy) {
        this.iRentStrategy = iRentStrategy;
    }

}
