/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dst2;

/**
 *
 * @author AdminSC
 */
public class DST2<T,S> {
    private T value1;
    private S value2;

    public DST2(T value1, S value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public T getValue1() {
        return value1;
    }

    public S getValue2() {
        return value2;
    }

    public void setValue1(T value1) {
        this.value1 = value1;
    }

    public void setValue2(S value2) {
        this.value2 = value2;
    }
    
    
    
    
    
    

    
}
