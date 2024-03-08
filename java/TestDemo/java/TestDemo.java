package TestDemo.java;

import java.util.function.IntPredicate;

public class TestDemo {

    // Method to calculate the square of a given number
    public int calculateSquare(int num) {
        return num * num;
    }

    // Inner class MyClass with method addPositive
    public class MyClass {
        public int addPositive(int a, int b) {
            if (a > 0 && b > 0) {
                return a + b;
            } else {
                throw new IllegalArgumentException("Both parameters must be positive!");
            }
        }
    }

    // Method addPositive that returns an IntPredicate
    public IntPredicate addPositive(int a, int b) {
        return num -> num > 0;
    }
}
