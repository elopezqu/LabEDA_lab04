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
	    System.out.print( "Introduzca el tamaño maximo del ultimo arreglo: " );
	    tamano = teclado.nextInt();  
	    
	    ArrayList<ListDouble<Integer>> casos = new ArrayList<ListDouble<Integer>>();        
	    String archivoInsercion = "insercion3.txt";
	    PrintWriter oS = new PrintWriter(archivoInsercion);        
	    
	    for(int n=1; n<=tamano; n++) {
	    	casos.add(generarPeorCaso(n));
	    }
	    Iterator<ListDouble<Integer>> puntero = casos.iterator();
	    while(puntero.hasNext()){        	
	    	oS.println( String.valueOf(insertionSort(puntero.next())));        	
	    }
	    oS.close();        
	    // plot "/Users/richarteq/eclipse-workspace/Algoritmica/insercion.txt" with lines        
	    JavaPlot p = new JavaPlot();
		p.addPlot("\"insercion3.txt\" with lines " );
		p.plot();
    }

    public static Lista<Integer> generarPeorCaso(int t) {
        ListDouble<Integer> misLista = new ListDouble<Integer>();
		for (int i=0; i<t; i++) {
			misLista.agregarAlInicio(i);	
		}
		return misLista;
    }

    public static long insertionSort(Lista<Integer> A) {
        int key;
		int i;
		long nano_startTime = System.nanoTime(); 
		for(int j=1; j<A.getTamaño(); j=j+1) {
			if(A.getTamaño()/2<j){
				key = A.getAtras(j).getData();
				i = j - 1;
				while (i > -1 && A.getAtras(i).getData() > key) {
					A.getAtras(i + 1).setData(A.getAtras(i).getData());
					i = i - 1;
				}
				A.getAtras(i + 1).setData(key);
			}else{
				key = A.getInicio(j).getData();
				i = j - 1;
				while (i > -1 && A.getInicio(i).getData() > key) {
					A.getInicio(i + 1).setData(A.getInicio(i).getData());
					i = i - 1;
				}
				A.getInicio(i + 1).setData(key);
			}
		}
		long nano_endTime = System.nanoTime();
		return nano_endTime - nano_startTime;
    }

}
