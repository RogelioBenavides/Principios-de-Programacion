//Rogelio Eduardo Benavides De La Rosa
//574161
//Realizado el 25 de Marzo del 2021
//Doy mi palabra de que he realizado esta actividad con integridad académica
import java.io.*;
import java.util.*;
import java.text.*;
class ArregloVentas{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      DecimalFormat twoDigit = new DecimalFormat("0.00");
      float arr1[] = new float[10];
      double acum = 0;
      for(int i=0; i<10;i++){
         System.out.println("Inserter un valor de la venta en la posición " + (i+1));
         arr1[i] = in.nextInt();
         acum += arr1[i];
      }
      double prom = acum/10;
      System.out.println("\t\tAlmacen\t\t\tVentas");
      for(int i=0; i<10;i++)
         System.out.println("\t\t\t" + (i+1)+ "\t\t\t\t" + twoDigit.format(arr1[i]));
      System.out.println("\t\tMedia de las ventas=\t\t$"+ twoDigit.format(prom));
      System.out.println("Almacenes cuyas ventas fueron superiores");
      System.out.println("\t\ta la media de las ventas");
      for(int i=0; i<10;i++)
         if(arr1[i]>prom)
            System.out.println("\t\t"+ (i+1)+"\t\t\t\t$"+twoDigit.format(arr1[i]));
   }
}