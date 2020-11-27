import java.util.Scanner;

public class Jugadores extends Persona{

    private int turno;

    public Jugadores(){


    }

    public Jugadores(String nombre, int turno){

        super (nombre);
        this.turno = turno;

    }

    public int getturno(){

        return turno;
    }

    public void setturno(int turno){

        this.turno = turno;
    }

    public void seleccionar(){

    

        Persona per = new Persona();
     
        System.out.println("hola " + getnombre() + "selecciona jugador (1) o (2)");




    }
}