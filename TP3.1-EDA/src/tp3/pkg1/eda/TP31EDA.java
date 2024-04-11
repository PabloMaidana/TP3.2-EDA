/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3.pkg1.eda;

/**

 */
public class TP31EDA {

    /**

     */
    public static void main(String[] args) {
        PilaOrdenada pila = new PilaOrdenada();  
        pila.insertarElementoOrdenado(1);
        pila.insertarElementoOrdenado(4);
        pila.insertarElementoOrdenado(3);
        pila.insertarElementoOrdenado(2);
        pila.insertarElementoOrdenado(5);      
        
        pila.mostrar();
//
//    String cadena = "[]{)(}";
//    PilaParentesis pilaCadena = new PilaParentesis(cadena);
//    pilaCadena.mostrar();
//    
    
    }
    
}
