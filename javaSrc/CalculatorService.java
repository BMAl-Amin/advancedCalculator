package com.example.alamin.calculator;



public class CalculatorService {
    private double result;

    public void calculateAddition(double numberA, double numberB){
        result= numberA + numberB;
    }
    public void calculateSubtraction(double numberA, double numberB){
        result= numberA - numberB;
    }
    public void calculateMultiplication(double numberA, double numberB){
        result= numberA * numberB;
    }
    public void calculateDivision(double numberA, double numberB){
        result= numberA / numberB;
    }
    public String getResult(){
        return Double.toString(result); //convert type of result double to string
    }

}
