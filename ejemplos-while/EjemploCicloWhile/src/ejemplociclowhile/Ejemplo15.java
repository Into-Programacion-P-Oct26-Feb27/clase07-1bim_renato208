/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplociclowhile;

/**
 *
 * @author SALASC
 */
public class Ejemplo15 {
    
    public static void main(String[] args) {
        
        int contador = 1;
        int limite = 1;
        while(contador < limite){
            System.out.printf("Valor %d\n", contador);
        }
        
    }
    
}

/*
En este ciclo nunca se ingresa ya que la condicion para entrar de
"contador < limite" es falsa, y los ciclos while solo se cumplen cuando la 
condicion es verdadera
*/
