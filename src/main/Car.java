package main;

public class Car {
    private double price;
    private int volume;
    private double tax;

    public Car() {

    }

    public Car(double price, int volume) {
    this.price = price;
    this.volume = volume;
    this.setTax();
    this.tax = this.getTax();
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public double getTax() {
        this.setTax();
        return tax;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
    //Dưới 100cc, 1% trị giá xe.
    //Từ 100 đến 200cc, 3% trị giá xe.
    //Trên 200cc, 5% trị giá xe
    public void setTax() {
        if (this.volume < 100) {
            this.tax = 0.01 * this.price;
        } else if (this.volume > 100 && this.volume < 200) {
            this.tax = 0.03 * this.price;
        } else {
            this.tax = 0.05 * this.price;
        }

    }
}
