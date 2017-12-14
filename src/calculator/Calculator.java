/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author rioswarawan
 */
public class Calculator implements CalculateListener {
    
    private BufferedReader reader;
    private CalculatorPresenter presenter;
    
    public Calculator() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        presenter = new CalculatorPresenter(this);
    }
    
    public void show() {
        try {
            System.out.print("Input nilai 1: ");
            Double value1 = Double.parseDouble(reader.readLine());

            System.out.print("Input nilai 2: ");
            Double value2 = Double.parseDouble(reader.readLine());

            System.out.println("(+) Tambah");
            System.out.println("(-) Kurang");
            System.out.println("(*) Kali");
            System.out.println("(/) Bagi");
            System.out.print("Pilih operator: ");
            String operator = reader.readLine();
            
            CalculatorModel model = new CalculatorModel();
            model.setValue1(value1);
            model.setValue2(value2);
            model.setOperator(operator);
            presenter.calculate(model);

        } catch (IOException | NumberFormatException ex) {
            System.out.println("Terjadi kesalahan: " + ex.getMessage());
        } finally {
            System.out.println("");
            System.out.println("Selesai");
        }
    }

    @Override
    public void onResult(String result) {
        System.out.println("Hasil : " + result);
    }
}
