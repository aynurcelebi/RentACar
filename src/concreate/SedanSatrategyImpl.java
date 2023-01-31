package concreate;

public class SedanSatrategyImpl implements IRentStrategy{
    @Override
    public void rentACar(Car car, Customer customer) {
        System.out.println("SEDAN Kiralama");
    }
}
