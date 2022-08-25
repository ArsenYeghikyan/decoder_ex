package home_work.task1;

public class Door implements Cloneable{
    public Door() {
    }

    private int doorNumber;

    public Door(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    @Override
    protected Door clone() {
        Door d= new Door();
        try {
           d =  (Door) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return d;
    }

    @Override
    public String toString() {
        return "Door{" +
                "doorNumber=" + doorNumber +
                '}';
    }
}
