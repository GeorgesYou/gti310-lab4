package gti310.tp4;
import java.util.*;
import java.math.*;

public class ConvertColor {

	// Matrice de conversion, source: https://cours.etsmtl.ca/gti310/private/Presentations/GTI310-3-ConceptsFondamentauxVideo-v14.pdf
	//private double matrice[][] = {{0.299,0.587,0.114},{-0.147,-0.289,0.436},{0.615, -0.515, -0.100}};
	
	public int[][][] convertRGBToYUV(int[][][] image)
	{
		
		int[][][] imageYUV = new int[Main.COLOR_SPACE_SIZE][][];
		
		for(int i = 0; i < image.length; i++)
		{
			for(int j = 0; j < image[0].length;j++)
			{
							
				int Y = (int)(0.299*image[Main.R][i][j] + 0.587*image[Main.G][i][j] +0.114*image[Main.B][i][j]);
				int U = (int)(0.492*(image[Main.B][i][j]-Y));
				int V = (int)(0.877*(image[Main.R][i][j]-Y));
				

				
				if(Y < 0 )
				{
					System.out.println("Couleur n�gative Y : " + Y);
					Y = (Math.abs(Y)*255)/(255+Math.abs(Y));
					
					System.out.println("Couleur corrig�e Y : " +Y);
				}else if(Y>255)
				{
					
				}
				
				if(U < 0)
				{
					System.out.println("Couleur n�gative U : " +U);
					
					U = (Math.abs(U)*255)/(255+Math.abs(U));
						
					System.out.println("Couleur corrig�e U : " +U);
				}
				else if(U>255)
				{
					
				}
				
				if(V < 0 )
				{
					System.out.println("Couleur n�gative V : " +V);
					V = (Math.abs(V)*255)/(255+Math.abs(V));	
					System.out.println("Couleur corrig�e V : " +V);
				}else if(V>255)
				{
					
				}
				
				
			/*	imageYUV[Main.Y][i][j]=Y;
				imageYUV[Main.U][i][j]=U;
				imageYUV[Main.V][i][j]=V;	
				*/
			}			
		}
		
		
		return imageYUV;
	}
}
