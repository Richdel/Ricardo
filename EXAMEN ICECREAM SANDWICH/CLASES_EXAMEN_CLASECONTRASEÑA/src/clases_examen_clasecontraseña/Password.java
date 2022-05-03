package CLASES_EXAMEN_CLASECONTRASEÑA;

import java.util.Scanner;

/**
 *
 * @author RICARDO
 */
public class Password {
    private String usuario;
    private int contraseña;
    
    
    public Password (){
        System.out.println("Sin parametros");
        usuario = "Panfila rodriguez 2022";
        contraseña = 123456789;
       
    }
    public Password (String usuario, int contraseña){
        System.out.println("Acepta paramentros");
        this.usuario = usuario;
        this.contraseña = contraseña;
        
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }
           
   public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       int clave;
       System.out.println("Coloca la contraseña");
       clave = teclado.nextInt();
       
       if (clave ==123456789){
           System.out.println("Is true");
       }
       else {
           System.out.println("is false");
       }
          
   }

   }
