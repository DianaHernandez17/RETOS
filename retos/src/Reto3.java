import java.util.*;
public class Reto3 {
        public static void  main(String[] args) {

         /* Programa que  le permita generar la simulación del juego piedra, papel o tijera.
          * mostrar por pantalla si gana o pierde.*/
          /* Piedra vence a Tijeras.
           * Papel vence a Piedra.
           * Tijeras vence a Papel.*/

                int lanzamiento=0;
                int apuesta;
                int acomulador1=0;
                int acomulador2=0;
                int opcion;
        
                Scanner Lectura = new Scanner(System.in);
                System.out.println("BIENVENIDO, ESTÁS LISTO PARA JUGAR PIEDRA, PAPEL O TIJERA?, EMPECEMOS.");
            
        
                System.out.println("Jugador por favor escriba su apuesta antes de lanzar:");
                apuesta=Lectura.nextInt();
            

                System.out.println("Jugador escoga 1 si desea PIEDRA o 2 si desea PAPEL y 3 si desea TIJERAS:");
                opcion=Lectura.nextInt();
            
                System.out.println("Su lanzamiento es de:"+opcion);
                lanzamiento=(int) (Math.random()*3)+1;
        
            
                if (lanzamiento==1 && opcion==1){
            
                    System.out.println("El lanzamiento que salio fue PIEDRA usted gano y la maquina perdio");
                    acomulador1=acomulador1+(apuesta);
                    System.out.println("Jugador usted gano:"+apuesta);
            
                } else if (lanzamiento==2 && opcion==2){
            
                    System.out.println("El lanzamiento que salio fue PAPEL usted gano y la maquina perdio");
                    acomulador1=acomulador1+(apuesta);
                    System.out.println("Jugador usted gano:"+apuesta);

                }else if (lanzamiento==3 && opcion==3){
            
                        System.out.println("El lanzamiento que salio fue TIJERAS usted gano y la maquina perdio");
                        acomulador1=acomulador1+(apuesta);
                        System.out.println("Jugador usted gano:"+apuesta);
            
                } else if (lanzamiento==1 && opcion==2){
                    System.out.println("El lanzamiento que salio fue TIJERAS perdiste GANÓ LA MAQUINA");
                    acomulador2=acomulador2+(apuesta-apuesta);
                    System.out.println("Jugador usted perdio lo que aposto:"+apuesta);
            
                }else if (lanzamiento==2 && opcion==1){
                    System.out.println("El lanzamiento que salio fue PIEDRA perdiste GANÓ LA MAQUINA");
                    acomulador2=acomulador2+(apuesta-apuesta);
                    System.out.println("Jugador usted perdio lo que aposto:"+apuesta);
                    
                }else if (lanzamiento==3 && opcion==1){
                        System.out.println("El lanzamiento que salio fue PAPEL perdiste GANÓ LA MAQUINA");
                        acomulador2=acomulador2+(apuesta-apuesta);
                        System.out.println("Jugador usted perdio lo que aposto:"+apuesta);


                System.out.println("¡GRACIAS POR ENTRETENERTE CONMIGO!");
            Lectura.close();
            
                
            }
            }
        }
