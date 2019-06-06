package Damas_Chinas;
import java.io.*;
public class Main{
  //Variables.  
    public char [] [] tablero;
    public char FichaNegra;
    public char FichaRoja;
    public boolean turno;
    int contador;        

 //Constructor(Se especifican las variables).
    public Main(){
        
        tablero      = new char[12][12];                
        FichaNegra   = 'X';
        FichaRoja    = 'O';
        turno        = true;  //Si el valor de "turno" es igual a "true" el turno es del jugador de fichas negras, de lo contrario es el turno del jugador de fichas rojas. 
        int contador = 0;     //Lleva la cuenta de las veces que han participado los Jugadores de las fichas negras y rojas. 
        inicializarTablero();  
    }
        
  //Inicia el arreglo, especifica el número que le corresponde a cada una de las casillas.
    public void inicializarTablero(){
        
        int posicion = 1;
        
        for(int i=0;i<10;i++){
                
                for(int j=0; j<10;j++){
                        
                        tablero[i][j] = Integer.toString(posicion).charAt(0);
                        posicion++;
                }                       
        }
    }
    
  //Imprime el formato del tablero.
    public void imprimirTablero(){
                
        for(int i=0;i<8;i++){
                
                for(int j=0;j<8;j++){
                        
                        if(j<8)
                        
                                System.out.print(" " + tablero[i][j] + " |");
                        
                        else
                                
                                System.out.print(" " + tablero[i][j] + " ");
                                                                
                }
                
                if(i<8)
                        
                        System.out.println("\n-----------");                                                                    
        }
        System.out.println();
        System.out.println();
        System.out.println();
    }
    
  //Indica la posicion donde se ingresara el dato dentro del arreglo por medio de parametros.   
    public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}
    
  //Manipula el valor de la variable "turno".   
    public void setTurno (boolean d) {turno = d;}
    
  //Manipula el valor de la variable "contador".   
    public void setContador (int e) {contador = e;} 
    
  //Regresa valor de la posicion del arreglo indicada por medio de parametros.   
    public char getPosicionArreglo (int a, int b)  {return tablero[a][b];} 
        
  //Regresa Valor de la variable "FichaNegra".
    public char getFichaNegra () {return FichaNegra;}            
   
  //Regresa Valor de la variable "FichaRoja".
    public char getFichaRoja () {return FichaRoja;}            
  
  //Regresa Valor de la variable "turno". 
    public boolean getTurno ()  {return turno;}
  
    //Regresa valor de la variable "contador".              
    public int getContador ()  {return contador;}           
    
   
  //Imprime e indica el turno del jugador que le toca elejir una casilla con ayuda del método "getTurno()".
    public void indicarTurno(){
        
        if(getTurno()==true)
                
                System.out.println("JUGADOR 1: Elija Una Casilla Ingresando El Numero Correspondiente.");
                
        else
                
                System.out.println("JUGADOR 2: Elija Una Casilla Ingresando El Numero Correspondiente.");       
    }
    
    
  //Regresa el caracter de tipo char para luego ingresarlo a alguna posición del arreglo, usandolo en otro método.
    public char obtenerFigura(){
        
        if(getTurno()==true)
                
                return FichaNegra;
                
        else
                
                return FichaRoja;      
    }
    
  //Cambia el valor de la variable "turno" para llevar el orden correcto de los turnos entre los 2 Jugadores.    
    public void cambiarTurno(){         
        
        if(obtenerFigura()=='X') //Si el método regresa un valor char igual a "X" cambia el valor de "turno" a "false".
                
                setTurno(false);
        
        else
                
                setTurno(true); 
    }
      
  //Verifica si la posicion del arreglo al que el jugador desea ingresar el caracter no fue utilizada antes.  
    public void comprobarEspacio(char espacio, int posicionUno, int posicionDos){
      
      //Si se cumple la condicion se ingresa el valor en la posicion del arreglo especificada.  
        if(espacio!=getFichaNegra()&&espacio!=getFichaRoja()){ 
                
           indicarPosicionArreglo(posicionUno, posicionDos,obtenerFigura());//Ingresa el caracter si se cumple la condición.
           cambiarTurno();                                                  //Cambia el turno si se cumple la Condición.  
           contador++;                                                      //Solo incremente cuando se cumple la condición anterior.              
        }
        
        else
         
         //Imprime el siguiente mensaje en caso de que no se cumpla la condición anterior.                              
           System.out.println("La Casilla Esta Ocupada, Elija Otra Por Favor");                 
    }
            
  //Método que hace uso de un "switch" para indicar la posicion del arreglo que el jugador elijio en el juego.  
    public void elegirPosicion(int posicion){
                           
            switch(posicion){
                
                  //Comprueba si la posición esta disponible guiandose del método "comprobarEspacio()"
                        case 1:comprobarEspacio(getPosicionArreglo(0,0),0,0);break;
                        case 2:comprobarEspacio(getPosicionArreglo(0,1),0,1);break;
                        case 3:comprobarEspacio(getPosicionArreglo(0,2),0,2);break;
                        case 4:comprobarEspacio(getPosicionArreglo(1,0),1,0);break;
                        case 5:comprobarEspacio(getPosicionArreglo(1,1),1,1);break;
                        case 6:comprobarEspacio(getPosicionArreglo(1,2),1,2);break;
                        case 7:comprobarEspacio(getPosicionArreglo(2,0),2,0);break;
                        case 8:comprobarEspacio(getPosicionArreglo(2,1),2,1);break;
                        case 9:comprobarEspacio(getPosicionArreglo(2,2),2,2);break;
                        
                        default:
                          //Imprime el siguiente mensaje en caso de que el "switch" no reciba un digito del 1 al 9.     
                                System.out.println("Por Favor, Ingrese Solo Un Digito Del 1 al 9.");break;                              
            }           
    }
    
  //Solo imprime un mensaje distinto dependiendo del jugador que haya ganado. 
    public void decirGanador(char a){
        
        
        if(a=='X')
                                
                System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 1!, HA GANADO!.");
        
                
        else if(a=='O')
                            
                    System.out.println("FIN DEL JUEGO: FELICIDADES JUGADOR 2!, HA GANADO!.");                      
                
                                
    }
    
 //Verifica las unicas 8 combinaciones que pueden dar la victoria a uno de los jugadores.
    public void buscarGanador(){
                  
      //Ciclo con instrucciones para comprobar las 3 posibilidades de ganar de forma horizontal.
        for(int i=0;i<3;i++){
                
                for(int j=1;j<2;j++){
                        
                        if(tablero[i][j]==tablero[i][j-1]&&tablero[i][j]==tablero[i][j+1]){
                                                        
                           decirGanador(tablero[i][j]);
                           imprimirTablero();
                           setContador(10);
                        }                               
                }                       
        }
   
      //Ciclo con instrucciones para comprobar las 3 posibilidades de ganar de forma vertical.  
        for(int i=0;i<3;i++){
                
                for(int j=1;j<2;j++){
                        
                        if(tablero[j][i]==tablero[j-1][i]&&tablero[j][i]==tablero[j+1][i]){
                        
                           decirGanador(tablero[j][i]);
                           imprimirTablero();
                           setContador(10);
                        }                               
                }
        }
        
      //Instrucciones para comprobar la única posibilidad de ganar de forma diagonal.   
        if(tablero[1][1]==tablero[0][0]&&tablero[1][1]==tablero[2][2]){
        
           decirGanador(tablero[1][1]);
           imprimirTablero();
           setContador(10);
        }   
           
      //Ciclo con instrucciones para comprobar la única posibilidade de ganar de forma diagonal inversa.
        if(tablero[1][1]==tablero[0][2]&&tablero[1][1]==tablero[2][0]){
                
           decirGanador(tablero[1][1]);
           imprimirTablero();                   
           setContador(10);
        }       
    }    
        
  //Método que contiene el flujo Y el orden del juego.
    public void jugarDamas(){
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("BIENVENIDO A JUEGO DAMAS Ver. 1.0");       
                
        do{
        
                indicarTurno();                 
                imprimirTablero();      
                try{elegirPosicion(Integer.parseInt(entrada.readLine()));}
                catch(IOException e){}    
                catch(NumberFormatException e){
                        
                        if(getTurno()==true)
                           
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 1.");
                        
                        else
                                
                           System.out.println("ERROR!: Ingreso Un Caracter No Valido, Por Favor, Intente Nuevamente JUGADOR 2.");       
                }
                         
                buscarGanador();
        
        }while(getContador()<9);
        
          if(getContador()==9){
                
                System.out.println("JUEGO EMPATADO!");                                        
            imprimirTablero();
            System.out.println("THANKS FOR PLAYING!");              
          }
         
         System.out.println("THANKS FOR PLAYING!");             
    }
    
    public static void main(String [] args){
        
        Main Objeto = new Main();
        
        Objeto.jugarDamas();     
                                                                                        
    }    
}