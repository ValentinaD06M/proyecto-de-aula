package JuegoDamasChinas;

import java.io.*;

public class PosiciónAdelantada 
{
    public static int[] pos_pieza_más_adelantada(Board board)
    {
        int f1 = 3, c1 = 4; // esquina inferior izquierda
        int f2 = 3, c2 = 7; // esquina inferior derecha
        int max = 0, dist1, dist2;
        int[] pos = new int[2]; //posicion a devolver
        
        for(int i = 3; i < board.filas; i++) {
            for(int j = 0; i < board.columnas; j++) {
                if(board[i][j] == 1) { //Fichas del jugador 1
                    //distancia a la primera esquina
                    dist1 = Math.abs(i - f1) + Math.abs(j - c1);
                    //distancia a la segunda esquina
                    dist2 = Math.abs(i - f2) + Math.abs(j - c2);
                    
                    if(dist1 < dist2) // usamos dist1
                    {
                        if(dist1 > max) {
                            max = dist1;
                            //fila de la ficha actualmente mas lejana
                            pos[0] = i;
                            //columna de la fciha actualmente mas lejana
                        }
                    }
                    else {
                        //usamos dist2
                        if(dist2 > max) { 
                            max = dist2;
                            //fila de la ficha actualmente mas lejana
                            pos[0] = i;
                            //columna de la fciha actualmente mas lejana
                            pos[1] = j;
                        }
                    }
                }
            }
        }
        return pos;
    }
}
