import java.util.*;
public class Reto8 {
    public static void main(String[] args) {
        int opciones,apoyos;

              Scanner Lectura =new Scanner(System.in);

        System.out.println("Aprendiz escoga 1 si tiene un auxilio y 2 si no está en ninguno:");
        opciones=Lectura.nextInt();

        if(opciones==1){
            System.out.println("Aprendiz usted ya tiene uno por lo tanto no puede aplicar:");

        } else if(opciones==2){

        System.out.println("Por favor ingrese a que auxilio queiere aplicar.");


System.out.println("Aprendiz escoga 1 si desea el de ALIMENTACIÓN  escoga 2 si desea el Apoyo a TRANSPORTE escoga 3 si desea el Apoyo a SOCIOECONOMICO:");
        apoyos=Lectura.nextInt();

        System.out.println("El apoyo asignado es el número:"+apoyos );
        apoyos=Lectura.nextInt();

        }Lectura.close();

        }
        
    }
    

