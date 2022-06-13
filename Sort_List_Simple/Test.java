package LabEDA_lab04.Sort_List_Simple;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.panayotis.gnuplot.JavaPlot;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
        int tamano;        
		Scanner teclado = new Scanner( System.in );
	    System.out.print( "Introduzca el tamaño máximo del último arreglo: " );
	    tamano = teclado.nextInt();  
	    
	    ArrayList<Lista<Integer>> casos = new ArrayList<Lista<Integer>>();        
	    String archivoInsercion = "insercion.txt";
	    PrintWriter oS = new PrintWriter(archivoInsercion);        
	    
	    for(int n=1; n<=tamano; n++) {
	    	casos.add(generarPeorCaso(n));
	    }
	    Iterator<Lista<Integer>> puntero = casos.iterator();
	    while(puntero.hasNext()){        	
	    	oS.println( String.valueOf(insertionSort(puntero.next())));        	
	    }
	    oS.close();   
	    // plot "/Users/richarteq/eclipse-workspace/Algoritmica/insercion.txt" with lines        
	    JavaPlot p = new JavaPlot();
		p.addPlot("\"insercion.txt\" with lines " );
		p.plot();

	}
	public static Lista<Integer> generarPeorCaso(int t) {
		Lista<Integer> misLista = new Lista<Integer>();
		for (int i=0; i<t; i++) {
			misLista.insert(t-i);	
		}
		return misLista;		
	}
	public static long insertionSort(Lista<Integer> A) {
		int key;
		int i;
		long nano_startTime = System.nanoTime(); 
		for(int j=1; j<A.size(); j=j+1) {
			key = A.get(j).getData();
			i = j-1;
			while(i>-1 && A.get(i).getData()>key) {
				A.get(i+1).setData(A.get(i).getData());
				i = i-1;
			}
			A.get(i+1).setData(key); 
		}
		long nano_endTime = System.nanoTime();
		return nano_endTime - nano_startTime;
	}

} 