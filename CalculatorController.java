/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.models.Operation;
import core.models.history.History;

/**
 *
 * @author dakar
 */
public class CalculatorController {

    private final Calculator calculator;
    private final History history;

    public CalculatorController(History history) {
        this.calculator = new Calculator();
        this.history = history;
    }

    public double add(double a, double b) {
        double result = calculator.add(a, b);
        history.addOperation(new Operation(a, b, "+", result));
        return result;
    }

    public double subtract(double a, double b) {
        double result = calculator.subtract(a, b);
        history.addOperation(new Operation(a, b, "-", result));
        return result;
    }

    public double multiply(double a, double b) {
        double result = calculator.multiply(a, b);
        history.addOperation(new Operation(a, b, "*", result));
        return result;
    }

    public double divide(double a, double b) {
        double result = calculator.divide(a, b);
        history.addOperation(new Operation(a, b, "/", result));
        return result;
    }

    public double potency(double a, double b) {
        double result = Math.pow(a, b);
        history.addOperation(new Operation(a, b, "^", result));
        return result;
    }

    public History getHistory() {
        return history;
    }

    public double performOperation(String string, double number1, double number2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}