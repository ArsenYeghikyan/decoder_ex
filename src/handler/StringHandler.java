package handler;

import annotations.StringAnno;

public class StringHandler {

    @StringAnno(str1 = "Hello",str2 = " World!")
    public String concatStr(String s1, String s2){

        return s1+s2;
    }




}
