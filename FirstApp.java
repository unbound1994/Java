package FirstApp.java;

public class FirstApp {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        int MyInt = 10;
        char MyChar = 'a';
        boolean MyBoolean = true;
        short MyShort = 324;
        long MyLong = 837458L;
        double MyDouble = 111222.333444;
        byte MyByte = -8;
        float MyFloat = 500.01f;

        System.out.println("Задание № 2");

        System.out.println("Объявленные переменные:");
        System.out.println("int = " + MyInt);
        System.out.println("char = " + MyChar);
        System.out.println("boolean = " + MyBoolean);
        System.out.println("short = " + MyShort);
        System.out.println("long = " + MyLong);
        System.out.println("double = " + MyDouble);
        System.out.println("byte = " + MyByte);
        System.out.println("float = " + MyFloat);

        System.out.println();
        System.out.println("Задание № 3");

        double a = 5;
        double b = 3;
        double c = 4;
        double d = 2;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double Resoult = CountABCD(a, b, c, d);
        System.out.println("Результат равен: " + Resoult);

        System.out.println();
        System.out.println("Задание № 4");

        int a1 = 10;
        int b1 = 5;

        System.out.println("a = " + a1);
        System.out.println("b = " + b1);

        boolean ResoultLimitAB = LimitAB(a1, b1);

        System.out.println("Результат равен: " + ResoultLimitAB);

        System.out.println();
        System.out.println("Задание № 5");

        long PosNegVar = 0;
        PosNeg(PosNegVar);

        System.out.println();
        System.out.println("Задание № 6");

        int PosNegBoolVar = -6;

        System.out.println("Число " + PosNegBoolVar + " является отрицательным: " + PosNegBool(PosNegBoolVar));

        System.out.println();
        System.out.println("Задание № 7");

        String NameVar = "Зигмунд";
        Name(NameVar);

        System.out.println();
        System.out.println("Задание № 8");

        short YearsVar = 2496;
        Years(YearsVar);

        System.out.println();
        System.out.println("Конец домашнего задания ");


    }

    public static double CountABCD(double a, double b, double c, double d) {
        double Resoult = a * (b + (c / d));
        return Resoult;
    }

    public static boolean LimitAB(int a, int b) {
        boolean Resoult = ((a + b) >=10) & ((a + b) <=20);
        return Resoult;
    }

    public static void PosNeg(long a) {
        if (a>=0) {
            System.out.println("Число " + a + " является положительным");
        }
        else System.out.println("Число " + a + " является отрицательным");
    }

    public static boolean PosNegBool(int a) {
        if (a>=0) {
            return false;
        }
        else return true;
    }

    public static void Name(String Name) {
        System.out.println("Привет, " + Name + "!");
    }

    public static void Years(short a) {
        boolean a1 = false;
        if (a%4==0) {
            a1 = true;
        }
        boolean a2 = true;
        if (a%100==0) {
            a2 = false;
            if (a%400==0) {
                a2 = true;
            }
        }
        if (a1&a2) {
            System.out.println("Год " + a + " високосный");
        }
        else System.out.println("Год " + a + " не високосный");
    }
}
