package home_work.task1;

public class DeepCar {
    private  String model;
    private int price;
    private int weight;
    private Door door;

    public DeepCar() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public DeepCar(String model, int price, int weight, Door door) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.door = door;
    }

 public static DeepCar getCarDeepCloning(DeepCar original){
        DeepCar deepCar = new DeepCar();

        deepCar.door = original.door;
        deepCar.model = original.model;
        deepCar.price = original.price;
        deepCar.weight = original.weight;

        return deepCar;

 }


    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", door=" + door +
                '}';
    }
}
