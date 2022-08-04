package reflect;

public class DispHandler {

    @MyAnno2(str = "jghjg")
    @MyAnno2(str = "jkhk")
    public  void printInfo(String one, String two) {

        System.out.println(one+two);


    }
}
