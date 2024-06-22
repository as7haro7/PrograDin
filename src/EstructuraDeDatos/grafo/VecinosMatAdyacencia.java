package EstructuraDeDatos.grafo;

import java.util.Arrays;
import java.util.Scanner;

public class VecinosMatAdyacencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lee = new Scanner(System.in);
		int n = lee.nextInt();
		while(n-- > 0) {

			int nNodos = lee.nextInt();
			int[][] G = new int[nNodos+1][nNodos+1];
			lee.nextLine();
			for (int i = 1; i <= nNodos; i++) {
				String[] v = lee.nextLine().split(" ");
				for (int j = 0; j < v.length; j++) {
					G[i][Integer.parseInt(v[j])] = 1;
				}
			}

			//mostrar matriz de adyacencia
/*		for (int i = 1; i <= nNodos; i++) {
			for (int j = 1; j <= nNodos; j++) {
				System.out.print(G[i][j]);
			}
			System.out.println();
		}
*/		
			//vector almacena nro de vecinos de un nodo
			//vector equivalente al grado de salida de un nodo
			int[]salida = new int[nNodos+1]; 
			for (int i = 1; i <= nNodos; i++) {
				for (int j = 1; j <= nNodos; j++) {
					if(G[i][j] == 1)
						salida[i]++;
				}
			}
			//mostrar vector con nro de vecinos
/*		for (int i = 1; i < salida.length; i++) {
			System.out.print(salida[i] + " ");
		}
*/
			int men = Integer.MAX_VALUE;
			for (int i = 1; i < salida.length; i++) {
				if(men > salida[i])
					men = salida[i];
			}
//		System.out.println("\nnro minimo de vecinos: " + men);

			//mostrar el lugar o nodo con el minimo nro de vecinos
			for (int i = 1; i < salida.length; i++) {
				if(men == salida[i])
					System.out.print( i + " ");
			}
		}

	}
}
