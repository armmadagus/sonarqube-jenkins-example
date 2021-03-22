package com.tom.service;

public class MathService {

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    // Add Comment
    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
    
    public int addition(int firstNumber, int secondNumber) {
        if (firstNumber > 1)
        {
            System.out.println("1");
        }
        else if (secondNumber > 1)
        {
            System.out.println("2");
        }
        return firstNumber + secondNumber;
    }
}
