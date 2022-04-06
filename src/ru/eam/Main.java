package ru.eam;

import ru.eam.calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = 0;
        /*
        Проверяем делитель на равенство нолю и если он равен, то не производим деление так как деление на ноль это "слегка невозможная операция"
         */
        if (calc.isPositive.test(b)) {
            c = calc.devide.apply(a, b);
        }
        int d = calc.multiply.apply(a, b);
        int e = calc.pow.apply(3);
        int f = calc.abs.apply(5);

        calc.println.accept(c);
    }
}
