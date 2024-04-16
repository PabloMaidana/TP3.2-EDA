/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1.eda;

import java.util.ArrayList;

/**
 *
 * @author pablo
 */
public class Pila {
    private ArrayList<Integer> pila;

    private int tope = -1;

    public Pila() {
        this.pila = new ArrayList<>();
    }

    public int getTope() {
        return tope;
    }
    
    public void push(int num){
            tope ++;
            pila.add(tope, num);
    }
    
    public void pop(){
        if (!isEmpty()) {
            pila.remove(tope);
            tope --;
        }
    }
    
    public boolean isEmpty(){
        if (tope == -1) {
            return true;
        }else{
            return false;
        }
    }
    
    public int peek(){
        return pila.get(tope);  
    }
    
    public void mostrar(){
        for (int i = 0; i < tope; i++) {
            System.out.println(pila.get(i));
        }
    }
}
