/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_try_catch;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_TRY_CATCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //exepciones -->OBJETOS
        Scanner input = new Scanner(System.in);
        System.out.println("introduce tu edad(numero entero):");
                  int iedad=0;  

        try{
            //Codigo que puede fallar
          iedad = input.nextInt();  
        }catch(InputMismatchException e){
        //Codigo que ejecutamos en caso de que ocurra una    
            //e.printStackTrace();
            System.out.println("upss. fallo la captura!!!");
        }
        System.out.println("tu edad: " +iedad);
    }
    
}
