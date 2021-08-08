//Rogelio Benavides - 574161
//Entradas: No Hay
//Resultados Lo que venden del 1 al 999
//Obtener el total de los boletos impares y el total de todos los boletos (Juntos) Usar la menor cantidad de instrucciones
import java.io.*;
import java.text.*;
class Rifa{
   public static void main (String args[]){
      DecimalFormat dinero = new DecimalFormat("0.00");
      int acum = 0;
      int acumImpar = 0;
      int acumPar = 0;
      for(int i = 1; i<=999; i++){
         if (i % 2 == 0)
            acumPar += i;
         else
            acumImpar += i;
      }         
      System.out.println("El total de los boletos pares será de: $" + dinero.format(acumPar));
      System.out.println("El total de los boletos impares será de: $" + dinero.format(acumImpar)); 
      System.out.println("El total todos los boletos será de: $" + dinero.format((acumPar + acumImpar))); 
   }
}