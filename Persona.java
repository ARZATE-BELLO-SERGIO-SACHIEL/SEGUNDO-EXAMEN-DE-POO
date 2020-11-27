public class Persona{

    //se suponia que con la erencia se hiba a unir el nombre 
    //y despues el jugador 
    private String nombre;

    public Persona(){


    }

    public Persona(String nombre){

        this.nombre = nombre;
    }

    public String getnombre(){

        return nombre;
    }

    public void setnombre(String nombre){

        this.nombre = nombre;
    }

    
}