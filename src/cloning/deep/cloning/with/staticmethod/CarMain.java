package cloning.deep.cloning.with.staticmethod;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car(200,"BMW");
        System.out.println("Original car: \n"+car);

       Car car1 = Car.deepCopyCar(car);

        System.out.println("Copied car: \n"+car1);




    }
}
