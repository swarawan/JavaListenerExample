/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.simple;

/**
 *
 * @author rioswarawan
 */
public class CalculatorModel {
    
    private double value1;
    private double value2;
    private String operator;

    /**
     * @return the value1
     */
    public double getValue1() {
        return value1;
    }

    /**
     * @param value1 the value1 to set
     */
    public void setValue1(double value1) {
        this.value1 = value1;
    }

    /**
     * @return the value2
     */
    public double getValue2() {
        return value2;
    }

    /**
     * @param value2 the value2 to set
     */
    public void setValue2(double value2) {
        this.value2 = value2;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    
}
