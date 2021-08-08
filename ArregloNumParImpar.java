//Rogelio Eduardo Benavides De La Rosa
//574161
//Realizado el 25 de Marzo del 2021
//Doy mi palabra de que he realizado esta actividad con integridad académica
import java.io.*;
import java.util.*;

class ArregloNumParImpar{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      char c[] = new char[20];
      int arr1[] = new int[20];
      int arr2[] = new int[20];
      for (int i = 0; i<20; i++){
         System.out.println("Inserter un valor para el primer arreglo en la posición " + (i+1));
         arr1[i] = in.nextInt();
         System.out.println("Inserter un valor para segundo arreglo en la posición " + (i+1));
         arr2[i] = in.nextInt();
         if (arr1[i]%2 == 0 && arr2[i]%2 == 0)
            c[i] = 'P';
         else if (arr1[i]%2 != 0 && arr2[i]%2 != 0)
            c[i] = 'I';
         else
            c[i] = 'N';
      }
      for (int i = 0; i<20; i++)
         System.out.println("El tercer arreglo en la posición " + (i+1) + " = " + c[i]);
   }
}