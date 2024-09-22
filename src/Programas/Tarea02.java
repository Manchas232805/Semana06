package Programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main (String[] args) {
        //Declarar variables
        int limite,numero;
        Scanner lectura = new Scanner(System.in);
        //Entrada de datos
        System.out.print("Ingresa el límite máximo para la secuencia: ");
        limite = lectura.nextInt();
        numero = 1;
        //Proceso de datos
        while (numero < limite) {
            System.out.println(numero);
            numero = numero * 2;
        }
        //Salida de datos
        System.out.println("El último número generado es: " + numero);
    }
}