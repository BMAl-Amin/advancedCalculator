package com.example.alamin.calculator;



public class CalculatorService {
    private double result;

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

}
