/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1.eda;

/**
 *
 * @author pablo
 */
public class PilasUnidas {
    private Pila pila1;
    private Pila pila2;
    private Pila pilaTotal;

    public PilasUnidas() {
        this.pila1 = new Pila();
        this.pila2 = new Pila();
        this.pilaTotal = new Pila();
    }
 
    public void llenarPilas(){
        pila1.push(10); 
        pila1.push(7); 
        pila1.push(5); 
        pila1.push(3); 
        pila1.push(2);
        pila1.push(1);
        
        pila2.push(15); 
        pila2.push(12);
        pila2.push(9); 
        pila2.push(4); 
    }
    
    
    public void insertarElementosPilaTotal(){
        while (!pila1.isEmpty() && !pila2.isEmpty()) {
            if (pila1.peek() >= pila2.peek()) {
                insertarElementoOrdenado(pila1.peek(),pilaTotal);
                pila1.pop();
            }else{
                insertarElementoOrdenado(pila2.peek(),pilaTotal);
                pila2.pop();
            }
        }
        while(!pila1.isEmpty()){
              insertarElementoOrdenado(pila1.peek(),pilaTotal);
              pila1.pop();
        }
        while(!pila2.isEmpty()){
              insertarElementoOrdenado(pila2.peek(),pilaTotal);
              pila2.pop();
        }    
    }
    
    public void insertarElementoOrdenado(int n,Pila pila){
        Pila pilaAux = new Pila();
        while (!pila.isEmpty() && pila.peek() < n) {
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
        if (!pilaTotal.isEmpty()){
            System.out.println("Lista elementos");
            pilaTotal.mostrar();
        }   
    }
    
}
