package cocreate;

// Bu interface rent işlemini soyutlamadan sorumludur..

public interface IRentCar {
    // RentACar işlemi yapmak için bize bir araç bilgisi birde müşteri bilgisi lazım.
    void rentACar(Car car, Customer customer);

}
