package Damas_Chinas;

import java.io.*;
import java.text.DecimalFormat;


public class Posición_Libre
{
		public static void main(String args[])
		{
				BufferedReader br =  new BufferedReader ( new InputStreamReader (System.in));
				BufferedWriter bw =  new BufferedWriter ( new OutputStreamWriter (System.out));
				DecimalFormat df = new DecimalFormat("#0.0000");
				
					
				try
				{
						double R = Double.parseDouble(br.readLine());
						double A = 3.14159 * Math.pow(R,2);
						
						bw.write("A=" + df.format(A) + "\n");
						bw.flush();
						
		}		
				catch (Exception e)
				{
						e.printStackTrace();
				}
		}
	
}