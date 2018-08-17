package com.example.alamin.calculator;


public class CalculatorService {
    private final double PERCENT=100.000000;
    private final double SQRPWR=2.000000;
    private final double SQRTPWR=0.500000;
    private double result=0.000000;

    public String calculateAddition(double numberA, double numberB){
        result= numberA + numberB;
        return String.valueOf(result);
    }
    public String calculateSubtraction(double numberA, double numberB){
        result= numberA - numberB;
        return String.valueOf(result);
    }
    public String calculateMultiplication(double numberA, double numberB){
        result= numberA * numberB;
        return String.valueOf(result);
    }
    public String calculateDivision(double numberA, double numberB){
        result= numberA / numberB;
        return String.valueOf(result);
    }
    public String calculateSqr(double numberA){
        result= Math.pow(numberA, SQRPWR);
        return String.valueOf(result);
    }
    public String calculateSqrt(double numberA){
        result= Math.pow(numberA, SQRTPWR);
        return String.valueOf(result);
    }
    public String calculatePercent(double numberA){
        result= numberA/PERCENT;
        return String.valueOf(result);
    }

}
