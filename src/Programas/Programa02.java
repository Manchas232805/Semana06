package Programas;
/*
    Crear un programa que permita ingresar una cantidad.
    Visualizar la cantidad invertida.

    por ejemplo:
    cantidad = 123
    caninv = 321
 */
import javax.annotation.processing.SupportedSourceVersion;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[] args){
        //declarar variables
        int cantidad, caninv, dig;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //proceso de datos
        caninv = 0;
        dig = 0;
        while (cantidad > 0) {
            dig = cantidad%10;
            caninv = (caninv * 10) + dig;
            cantidad = cantidad / 10;
        }
        //salidad de datos
    }
}
