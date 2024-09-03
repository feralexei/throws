package Throws;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class AdivinandoUnNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAdivinar = random.nextInt(50) + 1;
        int intentos = 0;
        boolean adivinado = false;

        System.out.println("Adivina el número entre 1 y 50!");

        while (!adivinado) {
            try {
                System.out.print("Ingresa tu número: ");
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (numeroUsuario > numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    adivinado = true;
                    System.out.println("¡Felicidades! Has adivinado el número en " + intentos + " intentos.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Debes ingresar un número.");
                scanner.next();
                intentos++;
            } finally {
                scanner.close();
            }
        }
    }
}
