/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1u4;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica1U4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner leer = new Scanner(System.in);

        double[] cantidades = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3,};
        int accion;
        do {
            System.out.println("¿Que accion desea realizar?");
            System.out.println("1 sumar las cantidades");
            System.out.println("2 mulkltiplicar las cantidades");
            System.out.println("3 salir");
            accion = leer.nextInt();

            double resultado = 0;

            switch (accion) {
                case 1:
                    for (int i = 0; i < cantidades.length; i++) {

                        resultado += cantidades[i];
                    }
                    System.out.println("la suma dse los numeros es " + resultado);
                    break;

                case 2:
                    resultado = 1;
                    for (int i = 0; i < cantidades.length; i++) {
                        resultado *= cantidades[i];
                    }
                    System.out.println("el resultado de la multiplicacion es " + resultado);
                    break;

                case 3:
                    System.out.println("Gracias por usqar el programa :3");
                    break;
                default:
                    System.out.println("opcion invalida");
            }
        } while (accion != 3);
    }

}
