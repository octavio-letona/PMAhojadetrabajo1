package view;

import java.util.Scanner;
import java.util.Locale;

public class MenuPrincipal {
    private Scanner scanner;

    public MenuPrincipal() {
        // Forzamos el uso de punto (.) para decimales
        this.scanner = new Scanner(System.in).useLocale(Locale.US);
    }

    public void mostrarMenu() {
        System.out.println("\n=== MÓDULO B: PROCESAMIENTO DE CADENAS ===");
        System.out.println("11. Concatenador de Nombre");
        System.out.println("12. Contador de Longitud");
        System.out.println("13. Inversor de Texto");
        System.out.println("14. Detector de Vocales");
        System.out.println("15. Extractor de Iniciales");
        System.out.println("16. Normalizador a Mayúsculas");
        System.out.println("17. Conversor Binario");
        System.out.println("18. Repetidor de Palabras");
        System.out.println("19. Validador de Password");
        System.out.println("20. Generador de Email");
        System.out.println("0.  Salir");
        System.out.print("Seleccione una opción: ");
    }

    public String pedirTexto(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public int pedirEntero(String mensaje) {
        System.out.print(mensaje + ": ");
        while (!scanner.hasNextInt()) {
            System.out.print("Entrada inválida. " + mensaje + ": ");
            scanner.next();
        }
        int numero = scanner.nextInt();
        limpiarBuffer();
        return numero;
    }

    public char pedirCaracter(String mensaje) {
        System.out.print(mensaje + ": ");
        String input = scanner.nextLine();
        return input.isEmpty() ? ' ' : input.charAt(0);
    }

    public void mostrarResultado(String resultado) {
        System.out.println(">> Resultado: " + resultado);
    }

    public void limpiarBuffer() {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}