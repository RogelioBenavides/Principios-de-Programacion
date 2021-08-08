import java.io.*;
import java.util.*;
class Alumno {
   public static void main (String[] args){
      Scanner entrada = new Scanner(System.in);
      System.out.print("Ingresa la primera calificacion: ");
      float calif1 = entrada.nextFloat();
      System.out.print("Ingresa la segunda calificacion: ");
      float calif2 = entrada.nextFloat();
      System.out.print("Ingresa la tercera calificacion: ");
      float calif3 = entrada.nextFloat();
      float promedio = (calif1 + calif2 + calif3) / 3;
      char califGeneral = '-';
      if (promedio <= 100 && promedio >= 90)
         califGeneral = 'A';
      else if(promedio < 90 && promedio >= 80)
         califGeneral = 'B';
      else if (promedio < 80 && promedio >= 70)
         califGeneral = 'C';
      else if (promedio < 70 && promedio >= 60)
         califGeneral = 'D';
      else if (promedio < 60 && promedio >= 0)
         califGeneral = 'F' ;           
      System.out.println("La calificacion del alumno es: " + califGeneral);
   }
}