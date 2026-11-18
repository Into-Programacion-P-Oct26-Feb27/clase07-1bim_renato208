/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo022 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        int multiImpares = 1;
        int sumaPar = 0;
        System.out.println("Ingrese el Límite"); 
        limite = entrada.nextInt(); // 6
        while (contador <= limite){
            
            if (contador%2!=0) {
                multiImpares = multiImpares * contador;
            }else{
                sumaPar = sumaPar + contador;
            }
            
            contador = contador + 1;
        }
        System.out.printf("La suma de los pares es: %d\n", 
                sumaPar);
        System.out.printf("La multiplicación de impares es: %d\n"
                , multiImpares);
    }
}
/*
Generar un programa que me permita ingresar un limite por teclado,
presentar la suma de todos los numeros pares y la multiplicación de los impares
que existan entre 1 y el limite:)
*/