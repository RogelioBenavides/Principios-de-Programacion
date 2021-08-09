//Proyecto Pre-Final
//Realizado por: Rogelio Eduardo Benavides De La Rosa y Óscar Luciano Flores Leija
//Matrículas 574161 y 570390
//Juego en donde el usuario se mueve a través de un tablero para llegar a la meta
//Fecha de entrega: 3 de mayo de 2021.
import java.io.*;
import java.util.*;
class Juego{
   //Método que imprime el mensaje de bienvenida
   public static void imprimir(){
      System.out.println("Bienvenido a nuestro juego, para ganar\nel jugador * debe de llegar a la meta M \nsin chocar con los obstáculos");
   }
   //Método que genera el tablero de juego vacío
   public static String [][] generarT(){
      String [][] tablero = new String[8][7];
      for (byte i = 0; i<=7; i++) 
         for(byte j = 0; j<=6; j++)
            tablero[i][j] = "   |";
      return tablero;
   }
   //Método que genera las córdenadas de la jugador
   public static int [] generarJ(){
      int [] jugador = new int [2];
      jugador [0] = (int) (Math.random()*8);
      jugador [1] = (int) (Math.random()*7);
      return jugador;
   }
   //Método que coloca la meta en el tableto
   public static String [][] colocarM(String [][] tablero, int [] meta){
      tablero [meta[0]][meta[1]] = " M |";
      return tablero;
   }
   //Método que genera las córdenadas de la meta
   public static int [] generarM(int [] jugador){
      int [] meta = new int [2];
      do { 
         meta [0] = (int) (Math.random()*8);
         meta [1] = (int) (Math.random()*7);
      } while (meta[0]==jugador[0] && meta[1]==jugador[1]);
      return meta;
   }
   
   //Método que genera una posición aleatoria del tablero y la sustituye con un obstáculo.
   public static String [][] generarO(String [][] tablero){
      int ox;
      int oy;
      do{
          ox = (int) (Math.random()*8);
          oy = (int) (Math.random()*7);
      }while(tablero[ox][oy].equals(" * |") || tablero[ox][oy].equals(" M |") || tablero[ox][oy].equals(" # |"));
         tablero [ox][oy] = " # |";
      return tablero;
   }
   /*Método que valida que no haya obstáculos puestos en forma de L que puedan obstruir al jugador o a la meta. 
   Únicamente revisa las poisciones del arreglo que no se encuentran en un borde.*/
   public static String [][] validarCentro(String [][] tablero){
      for (byte i = 1; i<7; i++){
         for (byte j = 1; j<6; j++){
            if(tablero[i][j].equals(" # |")){
               if(tablero[i-1][j-1].equals(" # |")){
                  tablero[i-1][j-1] = "   |";
                  generarO(tablero);
                  i = 1;
                  j = 1;
               } else if(tablero[i-1][j+1].equals(" # |")){
                  tablero[i-1][j+1] = "   |";
                  generarO(tablero);
                  i = 1;
                  j = 1;
               } else if(tablero[i+1][j-1].equals(" # |")){
                  tablero[i+1][j-1] = "   |";
                  generarO(tablero);
                  i = 1;
                  j = 1;
               } else if(tablero[i+1][j+1].equals(" # |")){
                  tablero[i+1][j+1] = "   |";
                  generarO(tablero);
                  i = 1;
                  j = 1;
               } 
            }
         }
       }
      return tablero;
   }
   //Metodo que valida que una esquina no esté rodeada de obstáculos si esta contiene al jugador o a la meta.
   public static String [][] validarEsquinas(String [][] tablero){
      if(tablero[0][0].equals(" * |") || tablero[0][0].equals(" M |")){
         if(tablero[0][1].equals(" # |")){
            tablero[0][1] = "   |";
            generarO(tablero);   
         }   
      }
      if(tablero[7][0].equals(" * |") || tablero[7][0].equals(" M |")){
         if(tablero[7][1].equals(" # |")){
            tablero[7][1] = "   |";
            generarO(tablero);   
         }   
      }
      if(tablero[0][6].equals(" * |") || tablero[0][6].equals(" M |")){
         if(tablero[0][5].equals(" # |")){
            tablero[0][5] = "   |";
            generarO(tablero);   
         }   
      }
      if(tablero[7][6].equals(" * |") || tablero[7][6].equals(" M |")){
         if(tablero[7][5].equals(" # |")){
            tablero[7][5] = "   |";
            generarO(tablero);   
         }   
      }
      return tablero;
   }
   //Método que imprime el tablero completo junto con la instrucción que indica como moverse.
   public static void imprimirTablero(String [][] tablero){
      System.out.println("\n-----------------------------");
      for (byte i = 0; i<=7; i++){
         for(byte j = 0; j<=6; j++){
            if (j == 0)
               System.out.print("|");
            System.out.print(tablero[i][j]);
            }
         System.out.println("\n-----------------------------");
         
      }
      System.out.println("Para moverte ingresa: w para arriba, s para abajo, a para izquierda y d para derecha");
   } 
   public static boolean moverJ(String [][] tablero, int [] jugador, int [] meta){
      Scanner in = new Scanner(System.in);
      boolean reinicio = false;
      do{
            tablero [jugador[0]][jugador[1]] = " * |";
            imprimirTablero(tablero);
            tablero [jugador[0]][jugador[1]] = "   |";
            char tecla = in.next().charAt(0);
            // Movimiento del jugador, se modifica la coordenada dependiendo de la letra introducida, solamente se aceptan w, a, s y d. 
            switch (tecla){
               case 'w':
                  //Si el jugador se encuentra en un borde, no se hace ninguna acción, se le indica al jugador que no puede moverse en esa dirección.
                  if(jugador[0] > 0)
                     jugador[0] -= 1;
                  else
                     System.out.println("¡Estas en un borde! No puedes moverte en esa dirección");
                  break;
               case 's':
                  if(jugador[0] < 7)
                     jugador[0] += 1;
                  else
                     System.out.println("¡Estas en un borde! No puedes moverte en esa dirección");
                  break;
               case 'd':
                  if(jugador[1] < 6)
                     jugador[1] += 1;
                  else
                     System.out.println("¡Estas en un borde! No puedes moverte en esa dirección");
                  break;
               case 'a':
                  if(jugador[1] > 0)
                     jugador[1] -= 1;
                  else
                     System.out.println("¡Estas en un borde! No puedes moverte en esa dirección");
                  break;
               default:
                  System.out.println("Presiona una tecla válida");
            }
            //Si el jugador choca con un obstáculo, el juego se reinicia desde el comienzo con un nuevo tablero. 
            if(tablero [jugador[0]][jugador[1]].equals(" # |")){
               System.out.println("Lo siento, has chocado con un obstáculo. Vuelve a empezar");
               reinicio = true;
            } else if(tablero [jugador[0]][jugador[1]].equals(" M |")){
               System.out.print("¡Lo has logrado! ¿Deseas empezar otro juego? (s/n): ");
               char otro = in.next().charAt(0);
               if (otro == 's')
                  reinicio = true;
            }
         } while(!(tablero [jugador[0]][jugador[1]] == tablero [meta[0]][meta[1]]) && !(tablero [jugador[0]][jugador[1]].equals(" # |")));
         return reinicio;
   }
   //Método main
   public static void main(String args[]){
      String [][] tablero = new String[8][7];
      int [] jugador = new int [2];
      int [] meta = new int [2];
      Juego.imprimir();
      boolean reinicio;      
      //Ciclo que reinicia el juego si el jugador toca un obstáculo o decide jugar otra partida si se gana
      do{ 
         reinicio = false;
         //Método que llena el tablero
         tablero = Juego.generarT();
         //Generar dos coordenadas del tablero para introducir al jugador y la meta
         jugador = Juego.generarJ();
         meta = Juego.generarM(jugador);
         //Se coloca la meta en el tablero
         tablero = Juego.colocarM(tablero, meta);
         /*Ciclo que manda llamar al método que genera obstáculos, lo llama 6 veces.
         El mismo método revisa que el obstáculo generado no sustituya al jugador, la meta u otro obstáculo.*/
         for (byte i = 0; i<6; i++)
            generarO(tablero);
         //Ciclo que manda llamar a los métodos que validan que el jugador y la meta no estén rodeados, repite este proceso 3 veces para asegurar que se haga correctamente. 
         for (byte i = 0; i<3; i++){
            validarCentro(tablero);
            validarEsquinas(tablero);
         }
         reinicio = Juego.moverJ(tablero, jugador, meta);
      } while(reinicio);     
   }
}