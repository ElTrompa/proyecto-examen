package proba;

import java.util.Scanner;

/**
 * Clase principal que solicita el nombre del usuario e imprime un saludo.
 */
public class main {

    /**
     * Método principal que ejecuta la aplicación.
     * Solicita al usuario su nombre a través de la consola y luego muestra un saludo personalizado.
     *
     * @param args Argumentos de línea de comandos (no utilizados en este programa).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Objeto Scanner para leer la entrada del usuario
        System.out.println(Hola, cual es tu nombre); // Mensaje de solicitud

        String nombre = scanner.next(); // Captura el nombre ingresado por el usuario

        System.out.println(Hola,  + nombre); // Saludo personalizado
        scanner.close(); // Cierra el Scanner para liberar recursos
    }
}

