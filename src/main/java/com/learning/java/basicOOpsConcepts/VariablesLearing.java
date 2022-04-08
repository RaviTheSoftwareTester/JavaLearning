package com.learning.java.basicOOpsConcepts;

public class VariablesLearing {

    public static void main(String [] args)
    {
        int myvar=100;
        int myvar1=100;

        System.out.println(myvar);
        System.out.println(myvar==myvar1);
        char regularU='U';
        char regularU1='U';
        char accenttedU= '\u00DA';

        System.out.println(regularU);
        System.out.println(accenttedU);
        System.out.println(regularU==accenttedU);//false

        //Primitive types are stored by value .....
        int var1=200;
        int var2 =var1;
        var1=300;



    }
}
