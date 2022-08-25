package home_work.task1;

public class Car implements Cloneable{

    private  String model;
    private int price;
    private int weight;
private Door door;
    public Car() {
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car(String model, int price, int weight, Door door) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.door = door;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Door getDoor() {
        return this.door.clone();
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public Car clone() {
        Car car = new Car();
        try {
           car =  (Car) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }




        return car;
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
