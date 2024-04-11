/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1.eda;

import java.util.Stack;

/**
 *
 * @author pablo
 */
public class PilaOrdenada {
    private Pila pila ;
    private Pila pilaAux = new Pila();
    
    
    public PilaOrdenada() {
        this.pila = new Pila();
    }
  
    public void insertarElementoOrdenado(int n){
        while (!pila.isEmpty() && pila.peek() > n) {
            pilaAux.push(pila.peek());
            pila.pop();
        }
        pila.push(n);
        while (!pilaAux.isEmpty()) {
            pilaAux.push(pila.peek());
            pila.pop();
        }
    }
    
    public void mostrar(){
        if (!pila.isEmpty()){
            System.out.println("Lista elementos");
            for (int i = 0; i < pila.getTope();i++){
                System.out.print(pila.peek() + ",");
            }
        }        
    }
    
}