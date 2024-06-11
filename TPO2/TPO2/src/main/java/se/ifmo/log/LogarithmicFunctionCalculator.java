package se.ifmo.log;

import se.ifmo.AbstractFunction;

public class LogarithmicFunctionCalculator extends AbstractFunction {

    private final Ln ln;
    private final Log2 log2;
    private final Log3 log3;
    private final Log5 log5;


    public LogarithmicFunctionCalculator(Ln ln, Log2 log2, Log3 log3, Log5 log5) {
        this.ln = ln;
        this.log2 = log2;
        this.log3 = log3;
        this.log5 = log5;
    }

    public LogarithmicFunctionCalculator() {
        this.ln = new Ln();
        this.log2 = new Log2(ln);
        this.log3 = new Log3(ln);
        this.log5 = new Log5(ln);

    }

    @Override
    public Double calculateValue(Double x, Double eps) {
        double lnResult = ln.checkAndCalculate(x, eps);
        double log2Result = log2.checkAndCalculate(x, eps);
        double log3Result = log3.checkAndCalculate(x, eps);
        double log5Result = log5.checkAndCalculate(x, eps);
        double result = ((log5Result*log5Result)*(log3Result+log3Result)/(log3Result*log3Result*log3Result))*(log5Result-log2Result) + lnResult;
        if (Double.isNaN(result)) throw new IllegalArgumentException("ODZ exception!");
        return result;
    }
}