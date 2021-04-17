package web.model;

public class Car {

    private String car_brand;
    private String model;
    private int year;

    public Car() {
    }

    public Car(String car_brand, String model, int year) {
        this.car_brand = car_brand;
        this.model = model;
        this.year = year;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }



    public String getCar_brand() {
        return car_brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

}


