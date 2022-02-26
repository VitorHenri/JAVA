/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factory;
import calculator.Calculator;
/**
 *
 * @author dell-vitor
 */
public abstract class Sum extends Calculator {

    public double plus(double a, double b) {
        double soma  = a + b;
        return soma;
    }

}
