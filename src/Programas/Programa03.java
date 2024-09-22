package Programas;

import java.util.Scanner;

/*
Crear un programa en java que permita ingresar una cantidad.
Visualziar el digito mayor, la cantidad de digitos
impares y la suma de digitos pares

por ejemplo:
cantidad = 78952
Resultados:
dmay = 0
dimp = 3
sdpares = 10
 */
public class Programa03 {
    public static void main(String[] args){
        //declarar variables
        int cantidad, dmay, cdimp, sdpares, r, dig;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.println("Ingresar una cantidad: ");
        cantidad = lectura.nextInt();
        //proceso de datos
        dmay = 0;
        cdimp = 0;
        sdpares = 0;
        while(cantidad > 0){
            dig = cantidad % 10;
                if (dig > dmay) {
                    dmay = dig;
                }
                r = dig % 2;
                if (r == 0) {
                    sdpares += r;
                } else {
                    cdimp++;
                }
                cantidad = cantidad / 10;
        }
        //salida de datos
        System.out.println("El digito mayor es : " +dmay);
        System.out.println("La cant digitos impares es : " + cdimp);
        System.out.println("La sauma de digigtos pares es : " + sdpares);
    }
}
