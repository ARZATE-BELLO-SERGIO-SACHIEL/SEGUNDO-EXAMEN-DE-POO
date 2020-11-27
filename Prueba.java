import java.util.Scanner;

public class Prueba{

    public static void main(String[] args) {
        
        Prueba pru = new Prueba(); 
        pru.juego();

        
    }

    

    public void juego(){

        Scanner entrada = new Scanner(System.in);
    

        char palabra1[] = new char[30];

        System.out.println("jugador 1 ingrese su palabra secreta");
        palabra1[30] = entrada.next().charAt(0);

        for(int i=0; i<palabra1.length; i++){

            System.out.println("-");





        }
    }
}