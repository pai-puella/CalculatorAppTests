package com.example.calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String add(int num1, int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String subtract(int num1, int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(int num1, int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    public String divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 недопустимо");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}