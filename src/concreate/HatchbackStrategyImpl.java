package concreate;

public class HatchbackStrategyImpl implements IRentStrategy{
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("HATCHBACK Kiralama..");
    }
}
