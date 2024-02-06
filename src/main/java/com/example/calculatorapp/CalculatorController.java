package com.example.calculatorapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String add(@RequestParam(required = true) Integer num1, @RequestParam(required = true) Integer num2) {
        return calculatorService.add(num1, num2);
    }

    @GetMapping("/minus")
    public String subtract(@RequestParam(required = true) Integer num1, @RequestParam(required = true) Integer num2) {
        return calculatorService.subtract(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiply(@RequestParam(required = true) Integer num1, @RequestParam(required = true) Integer num2) {
        return calculatorService.multiply(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam(required = true) Integer num1, @RequestParam(required = true) Integer num2) {
        return calculatorService.divide(num1, num2);
    }
}
