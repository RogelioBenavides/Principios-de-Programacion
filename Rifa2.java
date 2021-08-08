//Rogelio Benavides - 574161
//Entradas:No Hay
//Resultados Lo que venden del 2 al 998
// Obtener el total de los boletos impares y el total de todos los boletos (Juntos) Usar la menor cantidad de instrucciones
import java.io.*;
class Rifa2{
   public static void main (String args[]){
      int acum = 0;
      for(int i = 1; i<=998; i+=2)
         acum += i;      
      System.out.println("El total de los boletos pares será de: " + acum);  
   }
}