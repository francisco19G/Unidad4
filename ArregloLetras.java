/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglo.letras;

/**
 *
 * @author FRANCISCO JAVIER
 */
public class ArregloLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char [][] letras = new char [3][5];
        char letra= 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                letras[i][j]=letra;
                letra++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(letras[i][j]+ " ");
                
            }
            System.out.println("  ");
            
        }
    }
    
    
}
