/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMA.hoja1; // Asegúrate de que tenga el nombre correcto de tu paquete

import model.LogicaCadenas;
import view.MenuPrincipal;


public class Controlador {
    private final MenuPrincipal vista; // Aquí usamos MenuPrincipal en lugar de Vista
    private LogicaCadenas modelo;

    // Actualizamos el constructor para recibir MenuPrincipal
    public Controlador(MenuPrincipal vista, LogicaCadenas modelo) { 
        this.vista = vista;
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        MenuPrincipal vista = new MenuPrincipal();
        LogicaCadenas modelo = new LogicaCadenas();
        Controlador controlador = new Controlador(vista, modelo);
        controlador.iniciar();
    }
 
    public void iniciar() {
        int opcion;
        do {
            vista.mostrarMenu();
            opcion = vista.pedirEntero("Opción");

            switch (opcion) {
                case 11: ejecutarEj11(); break;
                case 12: ejecutarEj12(); break;
                case 13: ejecutarEj13(); break;
                case 14: ejecutarEj14(); break;
                case 15: ejecutarEj15(); break;
                case 16: ejecutarEj16(); break;
                case 17: ejecutarEj17(); break;
                case 18: ejecutarEj18(); break;
                case 19: ejecutarEj19(); break;
                case 20: ejecutarEj20(); break;
                case 0:  System.out.println("Saliendo del módulo..."); break;
                default: System.out.println("Opción no válida.");
            }
        } while (opcion != 0); 
    }
    private void ejecutarEj11() {
    String nombre = vista.pedirTexto("Ingrese el nombre");
    String apellido = vista.pedirTexto("Ingrese el apellido");
    vista.mostrarResultado(modelo.concatenarNombre(nombre, apellido));
}
    
    private void ejecutarEj12() {
    String palabra = vista.pedirTexto("Ingrese una palabra");
    vista.mostrarResultado("La palabra tiene " + modelo.contarLongitud(palabra) + " letras.");
}
  private void ejecutarEj13() {
    String palabra = vista.pedirTexto("Ingrese una palabra a invertir");
    vista.mostrarResultado(modelo.invertirTexto(palabra));
}
  
  private void ejecutarEj14() {
    char c = vista.pedirCaracter("Ingrese un carácter");
    boolean resultado = modelo.esVocal(c);
    vista.mostrarResultado(resultado ? "true (Es vocal)" : "false (No es vocal)");
}
  
  private void ejecutarEj15() {
    String nombre = vista.pedirTexto("Ingrese el nombre");
    String apellido = vista.pedirTexto("Ingrese el apellido");
    vista.mostrarResultado(modelo.extraerIniciales(nombre, apellido));
}
  
  private void ejecutarEj16() {
    String texto = vista.pedirTexto("Ingrese el texto mixto");
    vista.mostrarResultado(modelo.normalizarMayusculas(texto));
}
  
  private void ejecutarEj17() {
    String textoBinario = vista.pedirTexto("Ingrese texto de 0s y 1s");
    vista.mostrarResultado("La longitud es: " + modelo.conversorBinario(textoBinario));
}
  
  private void ejecutarEj18() {
    String palabra = vista.pedirTexto("Ingrese una palabra");
    int repeticiones = vista.pedirEntero("Ingrese la cantidad de repeticiones (N)");
    System.out.print(">> Resultado: ");
    modelo.repetirPalabras(palabra, repeticiones);
}
  
  private void ejecutarEj19() {
    String password = vista.pedirTexto("Ingrese la contraseña");
    vista.mostrarResultado(modelo.validarPassword(password));
}
  private void ejecutarEj20() {
    String nombre = vista.pedirTexto("Ingrese el nombre");
    String apellido = vista.pedirTexto("Ingrese el apellido");
    String dominio = vista.pedirTexto("Ingrese el dominio (ej. kinal.edu.gt)");
    vista.mostrarResultado(modelo.generarEmail(nombre, apellido, dominio));
}
  
}