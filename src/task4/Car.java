package task4;

import java.io.Serializable;

public class Car implements Serializable {

   private   Models models;
  private   static   Engine engine;

    public Car(Models models, Engine engine) {
        this.models = models;
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car:" +
                "\nModel: " + models +engine;
    }
}
