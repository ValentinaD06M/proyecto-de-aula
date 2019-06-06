package Damas_Chinas;

import java.io.*;
import java.text.DecimalFormat;

public class Posición_Adelantada
{
		public static void main(String args[])
		{
				BufferedReader br =  new BufferedReader ( new InputStreamReader (System.in));
				BufferedWriter bw =  new BufferedWriter ( new OutputStreamWriter (System.out));
				int f1 = 3, c1 = 4; // esquina inferior izquierda
				int f2 = 3, c2 = 7; // esquina inferior derecha
				int max = 0, dist1, dist2;
				int[] pos = new int[2]; //posición a devolver
				char[] [] board;
				
				for(int i = 3; i < board.filas; i++) {
					for (int j = 0; i < board.columnas; j++) {
						if(board[i][j] == 1) { //fichas jugador 1
							//distancia a la primera esquina
							dist1 = Math.abs(i - f1) + Math.abs(j - c1);
							//distancia a la segunda esquina
							dist2 = Math.abs(i - f2) + Math.abs(j - c2);
							
							if(dist1 < dist2) // usamos dist1
						}
					}
				}
		}
	
}