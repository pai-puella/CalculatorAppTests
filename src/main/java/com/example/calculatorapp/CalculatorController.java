package com.example.calculatorapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String add(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 + num2;
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 - num2;
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int result = num1 * num2;
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 недопустимо");
        }
        int result = num1 / num2;
        return num1 + " / " + num2 + " = " + result;
    }
}
