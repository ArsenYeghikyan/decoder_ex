package task4;

import java.io.Serializable;

public class Engine implements Serializable {

    private static   int engine_power;


    public Engine(int engine_power) {
        this.engine_power = engine_power;
    }

    @Override
    public String toString() {
        return "\nEngine power: " + engine_power;

    }
}
