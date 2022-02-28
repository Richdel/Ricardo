/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva1_5_clase_computadora;

/**
 *
 * @author ricar
 */
public class EVA1_5_CLASE_COMPUTADORA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu1, compu2;
        compu1= new Computadora();
        compu1.setRam("16 GB De Ram");
        compu1.setMarca("HP");
        compu1.setSsd("256 GB SSD");
        compu1.setPrecio(15000.00);
        compu1.imprimirDatos();
        
    }
    
}
class Computadora{
//ATRIBUTOS
    private String ram;
    private String SSD;
    private String Marca;
    private double Precio;
    private double PrecioTotal;
    //Comportamiento
    public void setRam(String valor){
        ram=valor;
    }
    public String getRam(){
        return ram;
    }
    public void setSsd(String valor){
        SSD=valor;
    }
    public String getSsd(){
        return SSD;
    }
    public void setMarca(String valor){
        Marca=valor;
    }
    public String getMarca(){
        return Marca;
    }
    public void setPrecioTotal(double valor){

    }
    public double getPrecioTotal(){
        PrecioTotal = Precio*1.16;
        return PrecioTotal;
    }
    public void setPrecio(double valor){
        Precio=valor;
    }
    public double getPrecio(){
        return Precio;
    }
    public void imprimirDatos(){
        System.out.println("Datos de la pc: ");
        System.out.println("Ram: "+ getRam());
        System.out.println("SSD: "+ getSsd());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("Precio total con IVA: " + getPrecioTotal());
    }
    
}