/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_4_clase_auto;

/**
 *
 * @author ricar
 */
public class EVA1_4_CLASE_AUTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Automovil Carro = new Automovil();
        Carro.setMarca("Mustang");
        Carro.setTipo("gsdfsd");
        Carro.setmodelo("fsdfsd");
        Carro.setAño(2022);
        Carro.setColor("rojo");
        Carro.setPrecio(1600000.00);
        Carro.imprimirDatos();
    }
    
}
class Automovil{
    //atributos
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    //comportamiento
    //metodos set/Get
    public void setMarca(String valor){
        marca=valor;
    }
    public String getMarca(){
        return marca;
    }
    public void setmodelo(String valor){
        modelo=valor;
    }
    public String getModelo(){
        return modelo;
    }
    public void setTipo(String valor){
        tipo=valor;
    }
    public String getTipo(){
        return tipo;
    }
    public void setAño(int valor){
        año=valor;
    }
    public int getaño(){
        return año;
    }
    public void setColor(String valor){
        color=valor;
    }
    public String getColor(){
        return color;
    }
    public void setPrecio(double valor){
        precio=valor;
    }
    public double getPrecio(){
        return precio;
    }
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo");
        System.out.println("Marca: ");
        System.out.println("Modelo: ");
        System.out.println("Tipo: ");
        System.out.println("año: ");
        System.out.println("color: ");
        System.out.println("Precio:");
    }
    
}