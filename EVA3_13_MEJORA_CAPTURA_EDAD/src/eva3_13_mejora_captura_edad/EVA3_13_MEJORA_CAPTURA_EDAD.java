/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_13_mejora_captura_edad;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_13_MEJORA_CAPTURA_EDAD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean datoErroneo = true; 
        Scanner input = new Scanner(System.in);
        do{
            try{
                System.out.println("Introduce tu edad (VALOR ENTERO POSITiVO");
                int iedad = input.nextInt();
                System.out.println("Tu edad: "+iedad);
                datoErroneo = false;
            }catch(InputMismatchException e){
                System.out.println("no es un numero valido ");
            
            }catch(Exception e){
                System.out.println("edad no valida ");
            }
        }
    }
    
}
