/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

public class LogicaCadenas {
    public String concatenarNombre(String nombre, String apellido) {
    return nombre + " " + apellido;
}
    public int contarLongitud(String palabra) {
    return palabra.length();
}
    

public String invertirTexto(String palabra) {
    return new StringBuilder(palabra).reverse().toString();
    
}

public boolean esVocal(char caracter) {
    String vocales = "AEIOUaeiou";
    return vocales.indexOf(caracter) != -1;
}

public String extraerIniciales(String nombre, String apellido) {
    String inicialNombre = nombre.isEmpty() ? "" : String.valueOf(nombre.charAt(0));
    String inicialApellido = apellido.isEmpty() ? "" : String.valueOf(apellido.charAt(0));
    return (inicialNombre + inicialApellido).toUpperCase();
}
public String normalizarMayusculas(String texto) {
    return texto.toUpperCase();
}

public String conversorBinario(String texto) {
    return (texto.length() % 2 == 0) ? "Par" : "Impar";
}

public void repetirPalabras(String palabra, int n) {
    for (int i = 0; i < n; i++) {
        System.out.print(palabra + " ");
    }
    System.out.println(); 
}

}


