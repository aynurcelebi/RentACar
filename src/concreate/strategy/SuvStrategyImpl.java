package concreate.strategy;

import concreate.*;

public class SuvStrategyImpl implements IRentStrategy {
    @Override
    public void rentACar(Car car, Customer customer) {
        double suvMounthlyParam = 1.1;


        if (customer instanceof Person){
            System.out.println("You are not allowed for this operation!!");
        }
        else {
           if (RentType.MONTHLY.equals(car.getRentInfo().getRentType())){

//               RentInfo rentInfo  = new RentInfo();
//               double mounthlyPrice = suvMounthlyParam * car.getRentInfo().getMonthlyRentPrice();
//               rentInfo.setTotalPrice(mounthlyPrice);
           }
        }
        System.out.println("SUV Kiralama");
    }

}
