package utilidades;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


import objetos.Pila;


public class Writer {

	private final static String FICHERO = "C:\\Users\\nukep\\desktop\\ficherosprog\\salida1.txt";

	private ArrayList<Integer> pilasFinales = new ArrayList<>();
	
	public void escribirDatos(ArrayList<Integer> listaPilas) throws IOException {
		
		BufferedWriter ficheroSalida;
		try {
			
		
		ficheroSalida = new BufferedWriter(new FileWriter(FICHERO));
		
	//en pilas finales meteria las pilas a escribir pero no las tengo
		ficheroSalida.write(listaPilas.lastIndexOf(pilasFinales));
	
		ficheroSalida.close();
		}catch (Exception e){ 
			e.printStackTrace();
			
		}
		}
		
}
