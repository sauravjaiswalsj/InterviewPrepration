package begineer.Comparers;
import java.util.Arrays;
import Template.StressTestTool;
import java.lang.Comparable;
import java.util.Comparator;
class Car implements Comparable<Car>{
    private String carName;
    private String carType;

    public Car(String name, String type){
        this.carName = name;
        this.carType = type;
    }

    public String getCarName() {
        return carName;
    }

    public String getCarType() {
        return carType;
    }

    @Override
    public int compareTo(Car c1){
        return this.carName.compareTo(c1.carName);
    }
}
//or
class CarComparator implements Comparator<Car>{
    @Override
    public int compare(Car c1, Car c2){
        return c1.getCarName().compareTo(c2.getCarName());
    }
}
public class CarSort {
    public static void main(String[] args) {
        Car[] carArray = new Car[3];
        carArray[0] = new Car("Thar", "SUV");
        carArray[1] = new Car("Innova", "SUV");
        carArray[2] = new Car ("Verna", "Sedan");

        StressTestTool.TextColor.BLUE.print("Before Sort");
        Arrays.stream(carArray).forEach(x -> {
            StressTestTool.TextColor.PURPLE.print(x.getCarName());
            StressTestTool.TextColor.CYAN.print(x.getCarType());
        });

        Arrays.sort(carArray);

        StressTestTool.TextColor.RED.print("After Sort");

        Arrays.stream(carArray).forEach(x -> {
            StressTestTool.TextColor.PURPLE.print(x.getCarName());
            StressTestTool.TextColor.CYAN.print(x.getCarType());
        });

        //comparator Lambda
        Arrays.sort(carArray, (Car c1, Car c2) -> c2.getCarType().compareTo(c1.getCarType()));

        StressTestTool.TextColor.RED.print("After Sort");

        Arrays.stream(carArray).forEach(x -> {
            StressTestTool.TextColor.PURPLE.print(x.getCarName());
            StressTestTool.TextColor.CYAN.print(x.getCarType());
        });

        // Comparator Internal
        Arrays.sort(carArray, new Comparator<Car>(){
            @Override
            public int compare(Car c1, Car c2){
                return c1.getCarName().compareTo(c2.getCarName());
            }
        });


        // Comparator seperate comparator
        Arrays.sort(carArray, new CarComparator());

        StressTestTool.TextColor.RED.print("After Sort");

        Arrays.stream(carArray).forEach(x -> {
            StressTestTool.TextColor.PURPLE.print(x.getCarName());
            StressTestTool.TextColor.CYAN.print(x.getCarType());
        });

    }
}
