package com.example.calculatorapp;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String add(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Необходимо указать оба числа");}
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    public String subtract(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Необходимо указать оба числа");}
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    public String multiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new IllegalArgumentException("Необходимо указать оба числа");}
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