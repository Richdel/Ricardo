package CLASES_EXAMEN_CLASEPELICULA;

/**
 *
 * @author RICARDO
 */
public class Pelicula {
    public String pelicula;
    public String estudio;
    public int rating;
    
    void imprimirDatos (){
        System.out.println("El nombre de la pelicula es: " + pelicula);
        System.out.println("El estudio de la pelicula es: " + estudio);
        System.out.println("El rating (edad recomendada para ver la pelcual) : " + rating);
        
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
        

    }
    
   
     public static void main(String[] args) {
         Pelicula movie =  new Pelicula ();
         
         movie.setPelicula("Toy Story");
         movie.setEstudio("Pixar");
         movie.setRating(5);
         
         movie.imprimirDatos();
     }
}
