package Programmers.lv1;
/*
class Money{
    int amount;
    String code;

    public Money(int amount, String code) {
        this.amount = amount;
        this.code = code;
    }
}*/

import java.util.Objects;

public class SwapTest {
//    int amount;
//    String code;
//
//    public SwapTest(int amount, String code) {
//        this.amount = amount;
//        this.code = code;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SwapTest test = (SwapTest) o;
//        return amount == test.amount && Objects.equals(code, test.code);
//    }
//
//    @Override
//    public int hashCode() {
//        System.out.println("!!!!!!!!!!"+Objects.hash(amount, code));
//        return 0;//Objects.hash(amount, code);
//    }
//
//    public static void main(String[] args) {
//        SwapTest income = new SwapTest(55,"USD");
//        SwapTest expenses = new SwapTest(55,"USD");
//        String a = new String("test");
//        String b = new String("test");
//        int c = 5;
//        int d = 5;
//
//        System.out.println(a.hashCode());
//        System.out.println(b.hashCode());
//        boolean balance1 = income.equals(expenses);
//        System.out.println(c == d);
//        System.out.println(a.equals(b));
//
//        System.out.println("balance1" + balance1);
//        System.out.println("income" + income);
//        System.out.println("expenses" + expenses);
//    }

 /*   int value;

    public SwapTest(int value) {
        this.value = value;
    }
    public static void swap(SwapTest a, SwapTest b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }

    public static void main(String[] args) {
        SwapTest a = new SwapTest(1);
        SwapTest b = new SwapTest(2);
        System.out.println(a.value + " " + b.value);
        swap(a, b);
        System.out.println(a.value + " " + b.value);
    }

*/

    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        System.out.println();

        System.out.println(a + " " + b);
        swap(a, b);
        System.out.println(a + " " + b);

    }
}
