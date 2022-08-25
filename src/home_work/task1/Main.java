package home_work.task1;

public class Main {
    public static void main(String[] args) {


        DeepCar car = new DeepCar("BMW", 1992,2000, new Door(2));

        car.setModel("aa");
        System.out.println("shallow"+ car);
        DeepCar car1= DeepCar.getCarDeepCloning(car);


        System.out.println("========================================");


        System.out.println(car1);

    }
}
