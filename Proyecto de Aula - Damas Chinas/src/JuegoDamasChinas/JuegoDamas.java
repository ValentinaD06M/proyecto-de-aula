package JuegoDamasChinas;

import java.io.*;

public class JuegoDamas
{
	//Se definen las variables.
	public char [] [] tablero;
	public char FichaNegra;
	public char FichaRoja;
	public boolean turno;
	int contador; 
	
		//Constructor(se especifican las variables).
		public void Main()
		{
			tablero = new char[3][3]; 
			FichaNegra = 'X';
			FichaRoja = 'O';
			turno = true; //Si el valor de "turno" es igual a "true" el turno es del jugador de las fichas negras, de lo contrario es el turno del jugador de las fichas rojas. 
			int contador = 0; //se encarga de llevar la cuenta de las Veces que han participado ambos jugadores. 
			inicializarTablero(); 
		}
	
			//Se define el arreglo, se especifica el número que le corresponde A cada una de las casillas del tablero.
			public void inicializarTablero()
			{
				int posicion = 1;
				for(int i=0;i<3;i++){
					for(int j=0; j<3;j++){
						tablero[i][j] = Integer.toString(posicion).charAt(0);
						posicion++;
										 } 
									}
			}
			
				//Se imprime el tablero (como lo vera el usuario).
				public void imprimirTablero()
				{
					for(int i=0;i<3;i++){
						for(int j=0;j<3;j++){
							if(j<2)
								System.out.print(" " + tablero[i][j] + " |");
							else
									System.out.print(" " + tablero[i][j] + " ");
											}
						if(i<2)
							System.out.println("\n-----------"); 
										}
						System.out.println();
						System.out.println();
						System.out.println();
				}
				
					//Se indicara la posición en donde se ingresara el dato dentro del arreglo. 
					public void indicarPosicionArreglo (int a, int b, char c) {tablero [a][b]=c;}
					
						//Controla el valor de la variable "turno". 
						public void setTurno (boolean d) {turno =d;}
						
							//Controla el valor de la variable "contador". 
							public void setContador (int e) {contador =e;} 
							
								//Regresa el valor de la posicion del arreglo indicada por medio de parametros. 
								public char getPosicionArreglo (int a, int b) {return tablero[a][b];} 
								
									//Regresa valor de la Variable "FichaNegra".
									public char getFichaNegra () {return FichaNegra ;} 
									
										//Regresa Valor De La Variable "FichaRoja".
										public char getFichaRoja () {return FichaRoja ;} 
										
											//Regresa Valor De La Variable "turno". 
											public boolean getTurno () {return turno ;}

											//Regresa Valor De La Variable "contador". 
											public int getContador () {return contador ;}  
}
