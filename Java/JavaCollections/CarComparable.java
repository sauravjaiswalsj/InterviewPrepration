package JavaCollections;

import java.util.Arrays;

class Car implements Comparable<Car>{
    public String carType;
    public String carName;

    public Car(String carType, String carName) {
        this.carType = carType;
        this.carName = carName;
    }
    public String getCarType() {
        return carType;
    }

    public String getCarName() {
        return carName;
    }

    @Override
    public int compareTo(Car o2){
        return this.carName.compareTo(o2.carName);
    }
}

public class CarComparable {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0] = new Car("SUV", "Scorpio");
        cars[1] = new Car("SUV","Innova");
        cars[2] = new Car("SUV", "Bolero");
        //
        System.out.println("Before Sort");
        System.out.println();
        Arrays.stream(cars).forEach((Car c1) -> System.out.println(c1.carName));

        System.out.println();
        //System.out.printf(cars[0].carName);
        //Arrays.sort(cars, (Car c1, Car c2) -> c1.carName.compareTo(c2.carName));

        Arrays.sort(cars);
        System.out.println();
        System.out.println("After Sort");
        System.out.println();

        Arrays.stream(cars).forEach((Car c1) -> System.out.println(c1.carName));

        //Arrays.stream(cars).forEach((Car c1) -> System.out.println(c1.carType));
    }
}
