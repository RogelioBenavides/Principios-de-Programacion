import java.io.*;
import java.util.*;
class Ciudad {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String contaminacion = "";
      System.out.println("Ingrese el indice de contaminacion: ");
      short indice = input.nextShort();
      if (indice < 35)
         contaminacion = "agradable";
      else
         if(indice <= 60)
            contaminacion = "desagradable";
         else
            contaminacion = "peligroso";
      System.out.println("El indice de contaminacion es: " + contaminacion);
   }
}