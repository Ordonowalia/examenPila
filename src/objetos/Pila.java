package objetos;
import java.util.ArrayList;




public class Pila {

	private ArrayList<Integer> numeros= new ArrayList<>();


	public Pila(ArrayList<Integer> numeros) {
		super();
		this.numeros = numeros;
	}


	public void Meter() {
	int	numero=1;
 int numsDentro=0;
 if( numsDentro<30) {
	 numero=(int) Math.random()*100;
	 numeros.add(numero);
	 numsDentro++;
 }else {
	 
 }
	}
		
	public void borrar() {
		numeros.remove(numeros.lastIndexOf(numeros));

	}
	public void isFull(ArrayList<Integer> numeros) {
		
			if(numeros.containsAll(numeros)) {
				System.out.println("esta llena");
			}
			
		}
	public void isEmpty(ArrayList<Integer> numeros) {
		
		if(numeros.isEmpty()) {
			System.out.println("esta vacia");
		}
		
	}
	public int TamanioLista(ArrayList<Integer> numeros) {
	int	cosasDentro=0;
		for (int i = 0; i < numeros.size(); i++) {
			if(numeros.contains(numeros.get(i)));
			cosasDentro++;
			
		}
		return cosasDentro;
	}
		
	

	public ArrayList<Integer> getNumeros() {
		return numeros;
	}


	public void setNumeros(ArrayList<Integer> numeros) {
		this.numeros = numeros;
	}


	@Override
	public String toString() {
		return "Pila [numeros=" + numeros + "]";
	}
	
	

	
	
}
