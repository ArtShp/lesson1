package com.company;

public class Main {
    public static void main(String[] args) {
	    /*
        //Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a
        int a = 6;
        int P = a*4;

        System.out.println(P);
        */
	    /*
        //Begin2. Дана сторона квадрата a. Найти его площадь S = a^2
        int a = 6;
        int S = a*a;

        System.out.println(S);
        */
	    /*
        //Begin3. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b)
        int a = 6, b = 4;
        int S = a*b, P = 2*(a+b);

        System.out.println(S);
        System.out.println(P);
        */
	    /*
	    //Begin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве значения π использовать 3.14
        int d = 5;
        double L = d*3.14;
        System.out.println(L);
	    */
	    /*
	    //Begin5. Дана длина ребра куба a. Найти объем куба V = a 3 и площадь его поверхности S = 6·a^2
        int a = 5;
        int V = a*a*a, S = a*a*6;
        System.out.println(V);
        System.out.println(S);
	    */
	    /*
	    //Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c)
        int a=3, b=4, c=5;
        int V = a*b*c, S = (a*b + b*c + a*c)*2;
        System.out.println(V);
        System.out.println(S);
	    */
	    /*
	    //Begin7. Найти длину окружности L и площадь круга S заданного радиуса R:
        //L = 2·π·R, S = π·R^2
        int R = 5;
        final double pi = 3.14;
        double L = pi*R*2, S = pi*R*R;
        System.out.println(L);
        System.out.println(S);
        */
	    /*
	    //Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2
        int a = 4, b = 5;
        double avg = (a+b)/2.0;
        System.out.println(avg);
	    */
	    /*
	    //Begin9. Даны два неотрицательных числа a и b. Найти их среднее геометрическое, то есть квадратный корень из их произведения: √a·b
        int a = 3, b = 4;
        double avc = Math.sqrt(a*b);
        System.out.println(avc);
        */
	    /*
	    //Begin10. Даны два ненулевых числа. Найти сумму, разность,
        // произведение и частное их квадратов
        int a = 3, b = 5;
        int sum = a*a + b*b, diff = a*a - b*b, prod = a*a * b*b;
        double quot = a*a / (b*b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);
	    */
	    /*
	    //Begin11. Даны два ненулевых числа. Найти сумму, разность, произведение и частное их модулей
        int a = -3, b = 4;
        int sum = Math.abs(a) + Math.abs(b), diff = Math.abs(a) - Math.abs(b), prod = Math.abs(a) * Math.abs(b);
        double quot = Math.abs(a) / Math.abs(b);
        System.out.println(sum);
        System.out.println(diff);
        System.out.println(prod);
        System.out.println(quot);
        */
	    /*
	    //Begin12. Даны катеты прямоугольного треугольника a и b. Найти его гипотенузу c и периметр P:
        //c = √a^2 + b^2, P = a + b + c
        int a = 3, b = 4;
        double c = Math.sqrt(a*a + b*b);
        double P = a+b+c;
        System.out.println(c);
        System.out.println(P);
        */
        /*
	    //Begin13. Даны два круга с общим центром и радиусами R1 и R2 (R1 > R2).
        //Найти площади этих кругов S1 и S2, а также площадь S3 кольца, внешний
        //радиус которого равен R1, а внутренний радиус равен R2:
        //S1 = π·(R1)^2, S2 = π·(R2)^2, S3 = S1 − S2
        int R1 = 5, R2 = 3;
        double pi = 3.14;
        double S1 = pi*R1*R1, S2 = pi*R2*R2;
        double S3 = S1 - S2;
        System.out.println(S1);
        System.out.println(S2);
        System.out.println(S3);
        */
        /*
        //Begin14. Дана длина L окружности. Найти ее радиус R и площадь S круга,
        //ограниченного этой окружностью, учитывая, что L = 2·π·R, S = π·R^2
        double L = 10;
        double pi = 3.14;
        double R = L / (pi*2);
        double S = pi*R*R;
        System.out.println(R);
        System.out.println(S);
        */
        /*
        //Begin15. Дана площадь S круга. Найти его диаметр D и длину L окружности,
        //ограничивающей этот круг, учитывая, что L = 2·π·R, S = π·R^2
        double S = 10;
        double pi = 3.14;
        double D = Math.sqrt(S/pi)*2;
        double L = pi*D;
        System.out.println(D);
        System.out.println(L);
        */
    }
}