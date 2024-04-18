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
    PilaOrdenadaa pila = new PilaOrdenadaa();  
    
    PilasUnidas pila1 = new PilasUnidas();

        
    pila.insertarElementoOrdenado(1);
    pila.insertarElementoOrdenado(4);
    pila.insertarElementoOrdenado(3);
    pila.insertarElementoOrdenado(2);
    pila.insertarElementoOrdenado(5);  

    // Mostrar()-- Muestra los numeros de abajo hacia arriba de la pila
   
    System.out.println("Ejercicio A: ");
    pila.mostrar();
    
    System.out.println("");
   
    System.out.println("Ejercicio D");
    pila1.llenarPilas();
    pila1.insertarElementosPilaTotal();
    pila1.mostrar();
    }
    
}
