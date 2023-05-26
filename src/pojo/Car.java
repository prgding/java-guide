package pojo;

import java.io.Serializable;

public class Car implements Serializable {
    String carName;
    int carId;

    public Car(String carName, int carId) {
        this.carName = carName;
        this.carId = carId;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carId=" + carId +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }
}
