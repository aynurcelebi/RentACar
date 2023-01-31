package concreate;

public class RentInfo
{
    // Kiralama ile ilgili bilgilerin tutulduğu class

    private RentType rentType;  // Günlük ve aylık olarak kiralanacaklarını tutan değişken
    private double dailyRentPrice;
    private double monthlyRentPrice;

    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public double getDailyRentPrice() {
        return dailyRentPrice;
    }

    public void setDailyRentPrice(double dailyRentPrice) {
        this.dailyRentPrice = dailyRentPrice;
    }

    public double getMonthlyRentPrice() {
        return monthlyRentPrice;
    }

    public void setMonthlyRentPrice(double monthlyRentPrice) {
        this.monthlyRentPrice = monthlyRentPrice;
    }
}
