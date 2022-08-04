package task1;

import java.lang.annotation.Repeatable;

public class MathHandler {


    @MathAnno(num = "1000")
    @MathAnno(num = "2000")
    public void mathSum(String num1, String num2) {
        System.out.println("= " + (num1 + num2));
    }
}
