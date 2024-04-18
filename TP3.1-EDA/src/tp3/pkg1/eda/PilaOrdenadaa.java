/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1.eda;

/**
 *
 * @author pablo
 */
public class PilaOrdenadaa {
    private Pila pila ;
    private Pila pilaAux = new Pila();
    
    
    public PilaOrdenadaa() {
        this.pila = new Pila();
    }
  
    public void insertarElementoOrdenado(int n){
        while (!pila.isEmpty() && pila.peek() > n) {
            pilaAux.push(pila.peek());
            pila.pop();
        }
        pila.push(n);
        while (!pilaAux.isEmpty()) {
            pila.push(pilaAux.peek());
            pilaAux.pop();
        }
    }
    
    public void mostrar(){
        if (!pila.isEmpty()){
            System.out.println("Lista elementos");
            pila.mostrar();
        }        
    }
    
}
