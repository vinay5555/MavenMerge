package com.company;
import com.company.Calculator;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        System.out.println("------------Int max and min------------");
        int minIntValue = Integer.MIN_VALUE;
        int maxIntValue = Integer.MAX_VALUE;
        System.out.println("Int max " + maxIntValue);
        System.out.println("Int min " + minIntValue);
        System.out.println("------------Byte max and min------------");
        byte minValue = Byte.MIN_VALUE;
        byte maxValue = Byte.MAX_VALUE;
        System.out.println("Byte min " + minValue);
        System.out.println("Byte max " + maxValue);
        System.out.println("------------short max and min------------");
        short sminValue = Short.MIN_VALUE;
        short smaxValue = Short.MAX_VALUE;
        System.out.println("Short min " + sminValue);
        System.out.println("Short max " + smaxValue);
        System.out.println("------------long max and min------------");

        long lMinValue = Long.MIN_VALUE;
        long lMaxValue = Long.MAX_VALUE;
        System.out.println("Long min " + lMinValue);
        System.out.println("Long max " + lMaxValue);
        long a = 100L;
        System.out.println(a);
        System.out.println("------------float max and min------------");

        float fminValue = Float.MIN_VALUE;
        float fmaxValue = Float.MAX_VALUE;
        System.out.println("Float min " + fminValue);
        System.out.println("Float max " + fmaxValue);
        System.out.println("------------double max and min------------");

        double dminValue = Double.MIN_VALUE;
        double dmaxValue = Double.MAX_VALUE;
        System.out.println("Double min " + dminValue);
        System.out.println("Double max " + dmaxValue);

        System.out.println("------------operation on double------------");

        int d = 5;
        float b = 5.25f;
        double c = 5.25;

        System.out.println(d);
        System.out.println(b);

        System.out.println(c);
        System.out.println("------------working with char------------");

        char myChar = 'D';
        char myUniCode = '\u00A9';
        System.out.println("" + myUniCode + " " + myChar);

        System.out.println("------------working with boolean------------");

        boolean bool = true;
        System.out.println(bool);
        String str = "India";
        System.out.println("Welocome To " + str);
        String str2 = "" + myChar;
        System.out.println(str2);
        String str3 = "255.6" + "679.085";
        System.out.println(str3);

        //operators =,+,-,/,%,++,--,+=,-=,*=,/=,%=,
        // comparison operators ==,!=,<,>,<=,>=
        //logical operators && , ||, !
        //bitwise operator &, |


        //if then
        System.out.println("-----------if-then------------------");
        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It Is Not A Alien!!!!");
            System.out.println("They R Scary");
        }

        //Ternary Operator
        System.out.println("---------Ternary Operator-------");
        boolean wasAlien = isAlien ? true : false;
        System.out.println(wasAlien);
        int x = isAlien ? 5 : 4;
        System.out.println(x);

        //Operator Challenge
        System.out.println("---------Operator challenge-------");
        double s = 20.00d;
        double f = 80.00d;
        double g = (s + f) * 100.00d;
        g %= 40.00d;
        boolean isZero = (g == 0) ? true : false;
        System.out.println("isZero " + isZero);
       if (!isZero)
            System.out.println("got some remainder");
       Calculator h =new Calculator();
        System.out.println(h.add(1, 2));


    }
}
