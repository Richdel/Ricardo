
package examen_1ra_evaluacion_ice_cream_sandwich;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EXAMEN_1RA_EVALUACION_ICE_CREAM_SANDWICH {

    public static void main(String[] args) {
        // TODO code application logic here
        int numero;
        numero= Integer.parseInt(JOptionPane.showInputDialog("1 para elegirlos \n 2 para predefinidos"));
        if(numero == 1){
                    Scanner GN = new Scanner(System.in);
        Fibonacci fib = new Fibonacci();
        }else {
            Scanner GN = new Scanner(System.in);  
            
    FibonacciSE fibse = new FibonacciSE();
    fibse.setA1(1);
    fibse.setA2(2);
    fibse.setN(6);
    fibse.metodoFibonacciSE();

}
    }

    
}
  
class Fibonacci{
    //atributos
    private int a1=0;
    private int a2;
    private int n;
    private int valores=0;
    
    

public Fibonacci(){
    Scanner GN = new Scanner(System.in);
    System.out.println("Por favor digite la cantidad de elementos para la serie: ");
    n=GN.nextInt();
    System.out.println("Ingresa a1()Numero de inicio :");
    a1=GN.nextInt();
    System.out.println("ingresa a() Segundo numero:");
    a2=GN.nextInt();
    for (int i = 1; i < n; i++) {
        
        valores=a1+a2;
        a1=a2;
        a2 = valores;
        System.out.println(a2);

            }
}

}
 class FibonacciSE{
            private int n;
            private int a1;
            private int a2;
            private int valores;
                public void seta1(int a1){
        this.a1=a1;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getValores() {
        return valores;
    }

    public void setValores(int valores) {
        this.valores = valores;
    }

            public void metodoFibonacciSE(){
        Scanner GN = new Scanner(System.in);
                    System.out.println("los numeros pre definidos son: \n"
                    + "a2= "+a2+ "\n a1= "+ a1+"\n numero de elementos= "+n);
        for (int i = 0; i < n; i++) {

        valores=a1+a2;
        a1=a2;
        a2 = valores;
                System.out.println(a2);

            }

        }
       }     
            