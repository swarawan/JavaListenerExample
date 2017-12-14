/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator.bangundatar;

/**
 *
 * @author rioswarawan
 */
public class BangunDatar implements BangunDatarListener {
    
    private BangunDatarPresenter presenter;
    
    public BangunDatar() {
        presenter = new BangunDatarPresenter(this);
    }
    
    public void show() {
        int value1 = 10;
        int value2 = 0;
        int value3 = 0;
        
        System.out.println("x = "+value1);
        System.out.println("y = "+value2);
        System.out.println("z = "+value3);
        
        BangunDatarModel model = new BangunDatarModel();
        model.setValue1(value1);
        model.setValue2(value2);
        model.setValue3(value3);
        presenter.calculate(model);
    }

    @Override
    public void onGaris(int result) {
        System.out.println("Panjang garis adalah " + result);
    }

    @Override
    public void onKotak(int result) {
        System.out.println("Luas Segiempat adalah " + result);
    }

    @Override
    public void onSegitiga(int result) {
        System.out.println("Luas Segitiga adalah " + result);
    }
}
