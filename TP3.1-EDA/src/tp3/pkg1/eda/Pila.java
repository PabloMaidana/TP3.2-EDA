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
public class Pila {
    private Stack<Integer> stack = new Stack<> ();
    private Stack<Integer> stackAux = new Stack<> ();

    public Pila() {
    }
  
    public void insertarElementoOrdenado(int n){
        while (!stack.isEmpty() && stack.peek() > n) {
            stackAux.push(stack.pop());
        }
        stack.push(n);
        while (!stackAux.isEmpty()) {
            stack.push(stackAux.pop());
        }
    }
    
    public void mostrar(){
        System.out.println("Lista elementos");
        for (int n :stack){
            System.out.print(n + ",");
        }
    }
    
}
