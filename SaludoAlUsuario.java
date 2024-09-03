package Throws;

import java.util.Scanner;

public class SaludoAlUsuario {
    public static void main(String[] args) {
        saludar();
    }

    public static void saludar() {
        Scanner scanner = new Scanner(System.in);
        try {
            String nombre = solicitarNombre(scanner);
            System.out.println("Hola, " + nombre + "!");            
        } catch (IllegalArgumentException e) {
            System.err.println("Error: El nombre debe tener al menos 2 caracteres.");
        } finally {
            scanner.close();
        }

    }

    public static String solicitarNombre(Scanner scanner){

        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        if (nombre.length() < 2) {
            throw new IllegalArgumentException();
        }
        return nombre;
    }
}
