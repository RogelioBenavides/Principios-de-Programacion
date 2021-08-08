import java.io.*;
import java.util.*;

class PracticaArreglo{
   public static void main(String args[]){
      char [][] arreglo = new char [4][4];
      int posicionX;
      int posicionY;
      boolean respuesta;
      do {
         posicionX = pedirCoordenadaX();
         posicionY = pedirCoordenadaY();
         arreglo[posicionX][posicionY] = pedirCaracter();
         respuesta = otro();
      } while(respuesta);
      imprimir(arreglo);
   }
   public static int pedirCoordenadaX(){
      Scanner s = new Scanner(System.in);
      int posicion;
      System.out.print("Ingresa la cordenada x: ");
      posicion = s.nextByte();
      return posicion;
   }
   public static int pedirCoordenadaY(){
      Scanner s = new Scanner(System.in);
      int posicion;
      System.out.print("Ingresa la cordenada y: ");
      posicion = s.nextByte();
      return posicion;
   }
   public static char pedirCaracter(){
      Scanner s = new Scanner(System.in);
      System.out.print("Ingresa el caracter a ingresar: ");
      char caracter = s.next().charAt(0);
      return caracter;
   }
   public static boolean otro(){
      Scanner s = new Scanner(System.in);
      boolean conf = false;
      System.out.print("¿Quiere insertar otro caracter?: ");
      char caracter = s.next().charAt(0);
      if(caracter == 's')
         conf = true;
      return conf;
   }
   public static void imprimir(char [][] arreglo){
      for (byte i = 0; i < 4; i++){
         for (byte j = 0; j < 4; j++)
            System.out.print(arreglo[i][j] + " ");
         System.out.print("\n");
      }
   }
}