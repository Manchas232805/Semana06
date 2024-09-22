package Programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main (String[] args) {

        int numeroSecreto, intento;
        Scanner lectura = new Scanner(System.in);
        System.out.println("Usuario 1: ingrese un número del 1 al 10.");
        numeroSecreto = lectura.nextInt();
        intento = 0;

        while (intento != numeroSecreto) {
            System.out.print("Usuario 2 adivina el número (entre 1 y 10): ");
            intento = lectura.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Correcto! El número es " + numeroSecreto);
            }
        }
    }
}
