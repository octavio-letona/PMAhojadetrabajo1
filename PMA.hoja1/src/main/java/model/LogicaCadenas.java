/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sheyl
 */
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

}


