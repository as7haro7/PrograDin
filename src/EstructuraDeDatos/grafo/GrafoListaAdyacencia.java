package EstructuraDeDatos.grafo;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class GrafoListaAdyacencia {

	static Vector<Integer>[] G =new Vector[50];
	static int[] vis = new int[50];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Vector<Integer>[] G =new Vector[50];
		Scanner lee = new Scanner(System.in);
		int n = lee.nextInt(); //nro de nodos
		int m = lee.nextInt(); //nro de arcos
		
		for (int i = 1; i <= n; i++) {
			G[i] = new Vector<Integer>();
		}
		
		for (int i = 0; i < m; i++) {
			int u = lee.nextInt();
			int v = lee.nextInt();
			G[u].add(v);
		}
		//mostrar la lista de adyacencia
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < G[i].size(); j++) {
				System.out.print(G[i].get(j) + " ");
			}
			System.out.println();
		}
		
		//BFS recorrido en amplitud
		System.out.println("\nBFS");
		bfs(1);
		
		System.out.println("\nDFS");
		Arrays.fill(vis, -1);
		dfs(1);
		
		System.out.println("\nCamino Mínimo");
		//Arrays.fill(vis, -1);
		caminoMínimo(1);
		for (int i = 1; i <= n; i++) {
			System.out.println("Desde nodo 1 el camino minimo a " + i + " es: "+ vis[i]);
		}
		
/* datos de entrada
7 11
1 2
2 3
2 4
3 4
3 6
3 7
4 5
4 6
6 7
7 1
2 5
*/
		
	}

	static void caminoMínimo(int nodo) {
		// TODO Auto-generated method stub
		//int[] vis = new int[50];
		Arrays.fill(vis, -1);
		Queue<Integer> q = new LinkedList<Integer>();
		vis[nodo] = 0;
		q.offer(nodo);
		while(!q.isEmpty()){
			int u = q.poll();
			//System.out.print(u + " ");
			for (int v : G[u]) {
				if(vis[v] == -1) {
					vis[v] = vis[u]+1;
					q.offer(v);
				}
			}
		}
	}

	static void dfs(int nodo) {
		// TODO Auto-generated method stub
		//int[] vis = new int[50];
		//Arrays.fill(vis, -1);
		System.out.print(nodo + " ");
		vis[nodo] = 1;
		/*
		 for (int i = 0; i < G[nodo].size(); i++) {
			if(vis[G[nodo].get(i)] == -1)
				dfs(G[nodo].get(i));
		}
		*/
		for (int v : G[nodo]) {
			if(vis[v] == -1)
				dfs(v);
		}
	}

	static void bfs(int nodo) {
		// TODO Auto-generated method stub
		int[] vis = new int[50];
		Arrays.fill(vis, -1);
		Queue<Integer> q = new LinkedList<Integer>();
		vis[nodo] = 1;
		q.offer(nodo);
		while(!q.isEmpty()){
			int u = q.poll();
			System.out.print(u + " ");
			/*
			for (int i = 0; i < G[u].size(); i++) {
				if(vis[G[u].get(i)] == -1) {
					vis[G[u].get(i)] = 1;
					q.offer(G[u].get(i));
				}
			}
			*/
			for (int v : G[u]) {
				if(vis[v] == -1) {
					vis[v] = 1;
					q.offer(v);
				}
			}
		}
	}

}
