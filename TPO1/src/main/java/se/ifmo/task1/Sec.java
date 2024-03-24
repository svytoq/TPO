package se.ifmo.task1;

public class Sec {
    public static double calculate(double x, int n) {
        if (Double.isInfinite(x) || Double.isNaN(x))
            throw new IllegalArgumentException("Argument can't be infinite or null!");
        double PI2 = Math.PI * 2;
        x = x % PI2;
        if (Double.valueOf(Math.abs(x)).equals(Math.PI / 2))
            throw new IllegalArgumentException("Argument can't be 2PIN + PI/2!");
        double result = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= -x * x / ((2 * i - 1) * (2 * i));
            result += term;
        }
        return 1.0 / result;
    }
}
