//
import java.io.*;
import java.util.*;

class ArreglosBidimensional{
   public static void main(String arg[]){
      int m=ArreglosBidimensional.pedirM();
      int n=ArreglosBidimensional.pedirN();
      int a[][]=new int[m][n];
      int b[][]=new int[m][n];
      int c[][]=new int[m][n];
      a=ArreglosBidimensional.crearArreglo(m,n);
      b=ArreglosBidimensional.crearArreglo(m,n);
      c=ArreglosBidimensional.sumarAB(m,n,a,b);
      ArreglosBidimensional.desplegarC(c,m,n);
   }
   public static int pedirM(){
      Scanner s=new Scanner(System.in);
      System.out.println("ingrese la cantidad de renglones que tendran sus arreglos");
      return s.nextInt();
   }
   public static int pedirN(){
      Scanner s=new Scanner(System.in);
      System.out.println("ingrese la cantidad de columnas que tendran sus arreglos");
      return s.nextInt();
   }
   public static int[][] crearArreglo(int m, int n){ 
      int a[][]=new int[m][n];
      Scanner s=new Scanner(System.in);
      for(int i=0;i<m;i++)
      for(int j=0;j<n;j++){
	      System.out.println("ingresa el valor en el arreglo en las coordenadas:"+(i+1)+","+(j+1));
      	a[i][j]=s.nextInt();
      }
    return a;
   }
   public static int[][] sumarAB(int m, int n, int a[][], int b[][]){
      int c[][]=new int[m][n];
      for(int i=0;i<m;i++)
         for(int j=0;j<n;j++)
         c[i][j]=a[i][j]+b[i][j];
      return c;
   }
   public static void desplegarC(int c[][],int m,int n){
      for(int i=0;i<m;i++){
         for(int j=0;j<n;j++)
           System.out.print(c[i][j]+"  ");
           System.out.println("\n");
      }
   }
}//cierra la clase