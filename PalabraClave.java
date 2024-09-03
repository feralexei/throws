package Throws;
import java.util.Scanner;

public class PalabraClave {

    private String clave;
    public static void main(String[] args) {
        PalabraClave pc = new PalabraClave();
        try {
            pc.ingresarPalabraClave();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ingresarPalabraClave() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una palabra clave: ");
        clave = scanner.nextLine();

        try {
            validarPalabraClave(clave);
            System.out.println("La palabra clave es válida.");
        } catch (Exception e) {
            throw e;
        }

    }

    private void validarPalabraClave(String clave) throws Exception {
        if (clave.length() < 8) {
            throw new Exception("La palabra clave debe tener al menos 8 caracteres.");
        }
        if (contarNumeros(clave) != 4) {
            throw new Exception("La palabra clave debe contener exactamente 4 números.");
        }
        if (!clave.contains("z")) {
            throw new Exception("La palabra clave debe contener la letra 'z'.");
        }
    }

    private int contarNumeros(String clave) {
        int count = 0;
        for (char c : clave.toCharArray()) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}
