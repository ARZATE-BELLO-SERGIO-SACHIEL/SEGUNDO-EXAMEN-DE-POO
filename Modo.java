import java.util.Scanner;

public class Modo{

    Scanner entrada = new Scanner(System.in);
    JugadorVSJugador JVJ = new JugadorVSJugador();
    Maquina maq = new Maquina();


    public void seleccionarjuego(){
    
        int seleccion;

        System.out.println("hola vinvenido al juego del ahoraco");
        System.out.println("");
        System.out.println("por favor seleccione si quiere jugar con otra persona o con la maquina ");
        System.out.println("JUGADOR VS JUGADOR (1)");
        System.out.println("JUGADOR VS MAQUINA (2)");
        seleccion = entrada.nextInt();

        if(seleccion == 1){

            JVJ.juego();
            

        }else{

            maq.juegomaquina();
        }
    }

   
}