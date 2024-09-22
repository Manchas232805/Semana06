package Programas;
import java.util.Scanner;
public class Tarea03 {
    public static void main(String[] args) {
        // Declarar las variables
        int limite, suma, numero, ultimoPar;
        Scanner lectura = new Scanner(System.in);
        // Ingreso de datos
        System.out.print("Ingresa el límite máximo: ");
        limite = lectura.nextInt();
        suma = 0;
        numero = 1;
        ultimoPar = 0;
        // Proceso de datos
        while (numero <= limite) {
            if (numero % 2 == 0) {
                suma += numero;
                ultimoPar = numero;
            }
            numero++;
        }
        // Salida de datos
        System.out.println("La suma de los números pares hasta " + limite + " es: " + suma);
        System.out.println("El último número par sumado es: " + ultimoPar);

    }
}
