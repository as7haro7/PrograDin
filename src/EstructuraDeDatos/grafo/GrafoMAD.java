package EstructuraDeDatos.grafo;
import java.util.LinkedList;
import java.util.Scanner;


public class GrafoMAD {
	private boolean dirigido;
	private int maxNodos;
	private int numVertices;
	private boolean matAd[][];
	
	public GrafoMAD(int n, boolean dir) {
		this.maxNodos = 50;
		this.numVertices = n;
		this.dirigido = dir;
		this.matAd = new boolean[maxNodos][maxNodos];
	}
	
	public void insertaArista(int i, int j){
		this.matAd[i][j] = true;
		if(dirigido == false)
			matAd[j][i] = true;
	}
	
	public void eliminaArista(int i, int j){
		matAd[i][j] = false;
		if(dirigido == false)
			matAd[j][i] = false;
	}
	
	public void insertaVertices(int n){
		if(maxNodos- numVertices < n)
			System.out.println("Error supera el maximo numero de nodos");
		else{
			for (int i = 0; i < numVertices; i++) {
				for (int j = numVertices; j < numVertices+n; j++) {
					matAd[i][j] = matAd[j][i] = false;
				}
			}
		}
		numVertices = numVertices+n;
	}
	
	public boolean existeArista(int i, int j){
		if(matAd[i][j])
			return true;
		return false;
	}
	
	public void imprimeGrafo(){
		System.out.println("La matriz contiene: " + this.numVertices + "  vertices \n");
		for (int i = 0; i < numVertices; i++) {
			for (int j = 0; j < numVertices; j++) {
				if(matAd[i][j])
					System.out.print("  1");
				else
					System.out.print("  0");
			}
			System.out.println();
		}
	}
	//en un grafo dirigido
	//grado de entrada
	public int gradoInterno(int i){
		int cont=0;
		for (int j = 0; j < numVertices; j++) {
			if(matAd[j][i])
				cont++;
		}
		return cont;
	}
	//en un grafo dirigido
	//grado de salida
	public int gradoExterno(int i){
		int cont=0;
		for (int j = 0; j < numVertices; j++) {
			if(matAd[i][j])
				cont++;
		}
		return cont;
	}
	//en un grafo no dirigido
	public int grado(int i){
		return((gradoInterno(i)+gradoExterno(i))/2);
	}
	
	void profundidad(GrafoMAD g){
		boolean[] visitados = new  boolean[g.numVertices];
		for (int i = 0; i < g.numVertices; i++) {
			visitados[i] = false;
		}
		for (int i = 0; i < g.numVertices; i++) {
			if(!visitados[i])
				recorrerProfundidad(g,i,visitados);
		}
	}

	private void recorrerProfundidad(GrafoMAD g, int v, boolean[] visitados) {
		visitados[v] = true;
		System.out.print(v + "   ");
		for (int i = 0; i < g.numVertices; i++) {
			if((v != i) && g.existeArista(v, i) && !visitados[i])
				recorrerProfundidad(g, i, visitados);
		}
	}
	void amplitud(GrafoMAD g){
		LinkedList<Integer> cola = new LinkedList<Integer>();
		boolean[] visitados = new boolean[g.numVertices];
		int v;
		for (int i = 0; i < g.numVertices; i++) {
			visitados[i] = false;
		}
		
		for (int i = 0; i < g.numVertices; i++) {
			if(!visitados[i]){
				cola.offer(i);
				visitados[i] = true;
				while(!cola.isEmpty()){
					v = cola.poll();
					System.out.print (v + "   ");
					for (int j = 0; j < g.numVertices; j++) {
						if((v != j) && g.existeArista(v, j) && !visitados[j]){
							cola.offer(j);
							visitados[j] = true;
						}
					}
				}
			}
		}
	}


    public static void main(String[] args) {
		// TODO Auto-generated method stub
		//true = grafo dirigido
		//false = grafo no dirigido
		GrafoMAD g = new GrafoMAD(6, false);
		GrafoMAD g2 = new GrafoMAD(6, false);
		
//		g.insertaArista(0, 0);
//		g.insertaArista(0, 1);
//		g.insertaArista(1, 2);
//		g.insertaArista(1, 3);
//		g.insertaArista(2, 1);
//		g.insertaArista(2, 3);
//		g.insertaArista(3, 1);
		
		g.insertaArista(0, 1);
		g.insertaArista(0, 2);
		g.insertaArista(0, 3);
		
		g.insertaArista(1, 2);
		g.insertaArista(1, 5);
		
		g.insertaArista(2, 4);
		
		g.insertaArista(3, 4);
		
		g.insertaArista(4, 5);
		
		g.insertaArista(5, 5);
		
		//System.out.println(g.grado(1));
		g.imprimeGrafo();
		//siempre y cuando el grafo sea DIRIGIDO
		System.out.println("Interno: " + g.gradoInterno(0));
		System.out.println("Externo: " + g.gradoExterno(0));
		
		//siempre y cuando el grafo sea NO DIRIGIDO
		System.out.println("Grado: " + g.grado(0));
		
		
		System.out.println();
	//	System.out.println(g.gradoExterno(3));
	//	System.out.println(g.gradoInterno(3));
		
		//System.out.println(g.grado(3));
		System.out.println("\nRecorridos sobre grafo:");
		System.out.println("BFS: ");
		g.amplitud(g);
		System.out.println("\nDFS: ");
		g.profundidad(g);
		
		
	}
}
