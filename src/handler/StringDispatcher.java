package handler;

import annotations.StringAnno;

import java.lang.reflect.Method;

public class StringDispatcher {
    public static void main(String[] args) {

        StringHandler stringHandler  = new StringHandler();

        Class<?> cl = stringHandler.getClass();

        try {
            Method m = cl.getDeclaredMethod("concatStr", String.class, String.class);
            StringAnno stringAnno= m.getAnnotation(StringAnno.class);

            System.out.println(stringHandler.concatStr(stringAnno.str1(), stringAnno.str2()));


        } catch (NoSuchMethodException e) {
            System.out.println(" No Such Method");
        }


    }


}
