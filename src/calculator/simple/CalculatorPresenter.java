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
public class CalculatorPresenter {
    
    private CalculateListener listener;
    
    public CalculatorPresenter(CalculateListener listener) {
        this.listener = listener;
    }

    public void calculate(CalculatorModel model) {
        Double result = null;

        switch (model.getOperator()) {
            case "+":
                result = model.getValue1() + model.getValue2();
                break;
            case "-":
                result = model.getValue1() - model.getValue2();
                break;
            case "*":
                result = model.getValue1() * model.getValue2();
                break;
            case "/":
                result = model.getValue1() / model.getValue2();
                break;
        }
        
        String message = result == null ? "Operator tidak ditemukan" : String.valueOf(result);
        listener.onResult(message);
    }
}
