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
public class BangunDatarPresenter {
    
    private BangunDatarListener listener;
    
    public BangunDatarPresenter(BangunDatarListener listener) {
        this.listener = listener;
    }
    
    public void calculate(BangunDatarModel model) {
        
        if(model.getValue2() == 0 && model.getValue3() == 0) {
            
            // garis
            int result = model.getValue1();
            listener.onGaris(result);
        } else if(model.getValue3() == 0) {
            
            // segi empat
            int result = model.getValue1() * model.getValue2();
            listener.onKotak(result);
        } else {
            
            // segitiga
            int result = model.getValue1() * model.getValue2() * model.getValue3();
            listener.onSegitiga(result);
        }
    }
}
