import java.util.Scanner;
//se hiban a cargar todos los metodos 
public class Principal{

    public static void main(String []args){

        String nombre;
        int turno;

        Scanner entrada = new Scanner(System.in);

        Persona per = new Persona();
        Jugadores jug = new Jugadores();
        Modo mod = new Modo();
        JugadorVSJugador JVJ = new JugadorVSJugador();
        Maquina maq = new Maquina();

        

        mod.seleccionarjuego();
        System.out.println ("ingrese su nombre");
        nombre = entrada.nextLine();
        per.setnombre(nombre);
        jug.setnombre(nombre);
        jug.seleccionar();
        turno = entrada.nextInt();

        
    }
}