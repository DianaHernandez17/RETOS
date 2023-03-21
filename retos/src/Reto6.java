import java.util.*;
public class Reto6 {
    public static void  main(String[] args) {

        /* Programa que  le permita generar la simulación del juego Cara y Sello con WHILE
        Unicamente tiene 3 vidas,mostrar por pantalla si gana o pierde.*/
  
    int lanzamiento=0;
    int apuesta;
    int opcion;
    int acomulador1=0;
    int acomulador2=0;
    int i=1;


    Scanner Lectura = new Scanner(System.in);
    System.out.println("BIENVENIDO, ESTÁS LISTO PARA JUGAR CARA Y SELLO?, EMPECEMOS.");



    System.out.println("Jugador por favor escriba su apuesta antes de lanzar:");
    apuesta=Lectura.nextInt();

    System.out.println("Jugador escoga 1 si desea CARA o 2 si desea SELLO:");
    opcion=Lectura.nextInt();


    System.out.println("Su lanzamiento es de:"+opcion);
  

    while( i==1){
        for(int vidas=3; vidas>0;){
            System.out.println("Jugador escoga 1 si desea jugar o 2 si desea quiere terminar:");
            lanzamiento=Lectura.nextInt();

    lanzamiento=(int) (Math.random()*3)+1;

    if (lanzamiento==1 && opcion==1){

        System.out.println("Al lanzar salio fue CARA usted gano");
        acomulador1=acomulador1+(apuesta);
        System.out.println("Jugador usted gano lo que aposto: " +apuesta+ "La maquina perdio");

    } else if (lanzamiento==2 && opcion==2){

        System.out.println("El lanzamiento que salio fue SELLO usted gano");
        acomulador1=acomulador1+(apuesta);
        System.out.println("Jugador usted gano lo que aposto:  " +apuesta+  " La maquina perdio");

    } else if (lanzamiento==1 && opcion==2){
        System.out.println("El lanzamiento que salio fue CARA y perdiste");
        acomulador2=acomulador2+(apuesta-apuesta);
        System.out.println("Jugador usted perdio lo que aposto: " +apuesta+  " Gano la maquina");

    }else if (lanzamiento==2 && opcion==1){
        System.out.println("El lanzamiento que salio fue SELLO y perdiste");
        acomulador2=acomulador2+(apuesta-apuesta);
        System.out.println("Jugador usted perdio lo que aposto: " +apuesta+  " Gano la maquina");
        
    }vidas--;
    
    System.out.println("¡GRACIAS POR ENTRETENERTE CONMIGO!");
    
}
}
Lectura.close();
}
}


