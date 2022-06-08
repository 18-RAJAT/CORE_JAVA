import java.util.*;

public class P3_Task2_OperatorsInJava {

    public static void main(String[] args) {

        OperatorsInJava obj = new OperatorsInJava(); obj.UnaryOperator(); obj.ArithmeticOperator(); obj.ShiftOperator(); obj.RelationalOperator(); obj.BitwiseAndLogicalOperator(); obj.TernaryOperator(); obj.AssignmentOperator();

    }

}

class OperatorsInJava {

    void UnaryOperator() { int a = 10; boolean b = false;
        System.out.println("Inside UnaryOperator"); System.out.println(a++); // 10 = 11
        System.out.println(a--); // 11 =	10++
        System.out.println(++a); // 11 = 11
        System.out.println(--a); // 10 System.out.println(~a);
        System.out.println(!b); System.out.println("\n");
    }

    void ArithmeticOperator() {
        System.out.println("Inside Arithmetic Operator");

        int a = 10;
        int b = 5;
        System.out.println(a + b);// 15 System.out.println(a - b);// 5 System.out.println(a * b);// 50 System.out.println(a / b);// 2 System.out.println(a % b);// 0

        System.out.println(((10 * 10) / 5) + 3 - ((1 * 4) / 2));

        System.out.println("\n");
    }

    void ShiftOperator() {
        System.out.println("Inside ShiftOperator"); System.out.println(10 << 2);

        System.out.println(10 << 3);
        System.out.println(20 << 2);
        System.out.println(15 << 4);

        System.out.println(10 >> 2);
        System.out.println(20 >> 2);
        System.out.println(20 >> 3);

        System.out.println("\n");
    }

    void RelationalOperator() {

        System.out.println("Inside RelationalOperator");

        int a = 10;
        int b = 20;

        System.out.println(a == b); System.out.println(a != b); System.out.println(a > b); System.out.println(a < b); System.out.println(a >= b); System.out.println(a <= b);

        System.out.println("\n");

    }

    void BitwiseAndLogicalOperator() { System.out.println("Inside BitwiseOperators");

        int a = 10; int b = 5; int c = 20;

        System.out.println("a<b && a++<c"); System.out.println("a");

        System.out.println("a<b & a++<c"); System.out.println("a");

        System.out.println("a>b || a<c"); System.out.println("a>b || a<c");

        System.out.println("a>b || a++<c"); System.out.println("a");

        System.out.println("a>b | a++<c"); System.out.println("a");

        System.out.println("Bitwise inclusive OR:" + (12 | 12)); System.out.println("Bitwise exclusive OR:" + (12 ^ 12));

        System.out.println("\n");

    }

    void TernaryOperator() {

        System.out.println("Inside TernaryOperator");


        int a = 2;
        int b = 5;
        int min = (a < b) ? a : b; System.out.println(min);
        System.out.println("\n");
    }

    void AssignmentOperator() {

        System.out.println("Inside AssignmentOperator");

        int a = 10;
        int b = 20;

        a += 4;
        b -= 4;
        System.out.println(a); System.out.println(b);

        b >>>= 2;
        System.out.println(b);

        a = 10;
        a += 3;
        System.out.println(a); a -= 4;
        System.out.println(a); a *= 2; System.out.println(a); a /= 2; System.out.println(a);

        System.out.println("\n");
    }

}
