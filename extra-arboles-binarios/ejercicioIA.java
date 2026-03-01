package ejerciciosExamenesArb;

import java.util.ArrayList;
import java.util.List;

import us.lsi.tiposrecursivos.BEmpty;
import us.lsi.tiposrecursivos.BLeaf;
import us.lsi.tiposrecursivos.BTree;
import us.lsi.tiposrecursivos.BinaryTree;

public class ejercicioIA {

//	Contexto: Utilizaremos la interfaz BinaryTree<Integer> y la misma estructura de clases selladas (BEmpty, BLeaf, BTree)
//	que has estado manejando.Problema: Diseñe un algoritmo recursivo que, dado un árbol binario de enteros $T$:Determine el
//	camino (lista de enteros) desde la raíz a una hoja válida cuya suma de etiquetas sea la mínima posible.Un camino es válido 
//	si, y solo si, la etiqueta de cada nodo en ese camino es estrictamente mayor que el nivel de profundidad $i$ en el que se 
//	encuentra el nodo (donde la raíz está en el nivel $0$).En caso de que varios caminos tengan la misma suma mínima, se elegirá
//	el camino más corto (con menor longitud).Si no existe ningún camino que cumpla la condición de validez, el algoritmo debe 
//	devolver una lista vacía.
	
	private static record Tupla(Boolean esValido, List<Integer> mejorCamino, Integer suma, Integer size) {
		private static Tupla of(Boolean esValido, List<Integer> mejorCamino, Integer suma, Integer size) {
			return new Tupla(esValido, mejorCamino, suma, size);
		}
	}
	
	public static List<Integer> ejercicioIA(BinaryTree<Integer> tree) {
		return recursivo(tree, new ArrayList<>(), 0, 0).mejorCamino();
	}
	
	
	// si un camino no es válido dará una lista vacía ocn lo que su camino siempre va a ser mínimo y la suma mínima
	private static Tupla recursivo(BinaryTree<Integer> tree, List<Integer> camino, Integer suma, Integer i) {
		return switch (tree) {
		case BEmpty() -> Tupla.of(false, camino, 0, 0);
		case BLeaf(var lb) -> {
			camino.add(lb);
			if (lb>i) {
				yield Tupla.of(true, camino, suma+lb, i+1);
			}
			else {
				yield Tupla.of(false, camino, 0, 0);
			}
		}
		case BTree(var lb, var rt, var lt) -> {
			if (! (lb>i)) {
				yield Tupla.of(false, camino, 0, 0);
			}
			else {
				suma+=lb;
				camino.add(lb);
				Tupla hijoDer = recursivo(rt, new ArrayList<>(camino), suma, i+1);
				Tupla hijoIzq = recursivo(lt, new ArrayList<>(camino), suma, i+1);
				if (!hijoDer.esValido() || !hijoIzq.esValido()) {
					if (hijoDer.esValido()) {
						yield hijoDer;
					}
					else if (hijoIzq.esValido()) {
						yield hijoIzq;
					}
					else {
						yield Tupla.of(false, new ArrayList<>(), 0, 0);
					}
				}
				else {
					yield (hijoDer.suma() == hijoIzq.suma()) ? ((hijoDer.size() > hijoIzq.size()) ? hijoIzq : hijoDer) : 
						hijoDer.suma() > hijoIzq.suma() ? hijoIzq : hijoDer;

					
				}
			}
		}
		};
	}
	
	
}
