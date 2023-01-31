package concreate;

import concreate.strategy.SuvStrategyImpl;

import java.util.Date;

public class RentACarAPP {
    public static void main(String[] args) {

        Car car = new Car(CarType.SUV, new RentInfo(RentType.MONTHLY, 150, 2500));
        Person person = new Person();

        person.setTCKN(121371);
        person.setBirthDate(new Date());

        SuvStrategyImpl suvStrategy = new SuvStrategyImpl();

        RentCarImpl rentCarimpl  = new RentCarImpl(suvStrategy);
        rentCarimpl.rentACar(car, person);
    }
}
