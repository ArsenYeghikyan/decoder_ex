package handler;

import annotations.MathAnno;

public class MathHandler {
    @MathAnno(num1 = 10,num2 = 20)
    public void addTwoNumbers(int n1, int n2){
        System.out.println(n1+n2);
    }


}
