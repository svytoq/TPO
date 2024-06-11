package se.ifmo;

import se.ifmo.log.LogarithmicFunctionCalculator;
import se.ifmo.trig.TrigonometricFunctionCalculator;

public class Main {
    public static void main(String[] args) {
        TrigonometricFunctionCalculator trigonometricFunctionCalculator = new TrigonometricFunctionCalculator();
        System.out.println(trigonometricFunctionCalculator.calculateValue(-2.2370,0.0000001));
    }
}