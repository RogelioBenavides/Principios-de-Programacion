//Rogelio Eduardo Benavides De La Rosa - 574161
//Entrada: El límite, el valor de a
//Proceso: Sacar la potencia de -1 y multiplicarla por a
//Salida: La sumatoria
import java.io.*;
import java.util.*;
class Proceso{
   public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int a;
      int limit;
      int sumatoria = 0;
      do{
         System.out.println("Introduce el valor de a:");
         a = in.nextInt();
         System.out.println("Introduce el límite: ");
         limit = in.nextInt();
      }while (a < 0 && limit <= 1);
      for (int i = 1; i <= limit; i++)
         sumatoria += (int) (Math.pow(-1,i) * a);
      System.out.println("El valor de la sumatoria es: " + sumatoria); 
   }
}