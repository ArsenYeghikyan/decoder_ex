package cloning.deep.cloning.with.serialization;

public class Main {
    public static void main(String[] args) {
Cow  cow = new Cow("B",23,522);


Cow cow1 = Cow.cloningWithSerial(cow);
        System.out.println(cow1);
    }
}
