/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3.pkg1.eda;

/**
 *
 * @author pablo
 */
public class PilaParentesis {
    
    private String[] array;

    public PilaParentesis(String cadena) {
        cadena.length();
        array = new String[cadena.length()];
        for (int i = 0; i < cadena.length(); i++) {
            array[i] = "" + cadena.charAt(i);
        }
    }
    
    public void mostrar(){
        for (String i :array) {
            System.out.print(i);
        }
    }
    
    public boolean verificarEquilibrio(){
        boolean equilibrio = true;
        int tamAbierto = 0;
        int tamCerrado = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == "[" || array[i] == "{" || array[i] == "(" || array[i] == "<") {
                tamAbierto ++;
            }
            if (array[i] == "]" || array[i] == "}" || array[i] == ")" || array[i] == ">") {
                tamCerrado ++;
            }
        }
        if (!(tamAbierto == tamCerrado)) {
            return false;
        }
        
    }
    
}
