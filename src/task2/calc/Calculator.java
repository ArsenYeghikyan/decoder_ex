package task2.calc;

import task2.anotacion.Calc;

import java.lang.annotation.Documented;
import java.util.Scanner;

public class Calculator {
    /**
     * @author: Arsen Yeghikyan
     * @since 2022
     * @version 1.1
     */

    private Scanner sc = new Scanner(System.in);

private int result = 0;

    @Calc(num2 = 100, num1 = 500, operation = "/")
    public int calculate(int num1, int num2, String operation) {


        switch (operation) {

            case "+" -> result = num1 + num2;
            case "-" -> result = num1 - num2;
            case "/" -> result = num1 / num2;
            case "%" -> result = num1 % num2;
            case "*" -> result = num1 * num2;

        }


        return result;
    }


}
