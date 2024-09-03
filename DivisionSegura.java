package Throws;

import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args) throws Exception {
        obtenerNumeros();
    }

    public static void obtenerNumeros() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el dividendo (número a dividir): ");
        int dividendo = scanner.nextInt();
        System.out.print("Ingrese el divisor (número por el cual dividir): ");

        
        int divisor = scanner.nextInt();
        realizarDivision(dividendo, divisor);
        scanner.close();
    }

    //metodo division
    public static void realizarDivision(int dividendo, int divisor) {
        try {
            double resultado = dividir(dividendo, divisor);
            System.out.println("El resultado de la división es: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

    public static double dividir(int dividendo, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException(); 
        }
        return (double) dividendo / divisor;
    }

}
