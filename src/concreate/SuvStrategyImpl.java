package concreate;

public class SuvStrategyImpl implements IRentStrategy {
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("SUV Kiralama");
    }

}
