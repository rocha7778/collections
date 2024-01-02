package structures.of.data;

public class ListaDobleMenteEnlazada {
	Nodo inicio;

	public ListaDobleMenteEnlazada() {
		this.inicio = null;
	}

	public void agregarAlFinal(int dato) {
		Nodo nuevoNodo = new Nodo(dato);
		if (inicio == null) {
			inicio = nuevoNodo;
		} else {
			Nodo temp = inicio;
			while (temp.siguiente != null) {
				temp = temp.siguiente;
			}
			temp.siguiente = nuevoNodo;
			nuevoNodo.anterior = temp;
		}
	}

	public void imprimirLista() {
		Nodo temp = inicio;
		while (temp != null) {
			System.out.print(temp.dato + " ");
			temp = temp.siguiente;
		}
		System.out.println();
	}

	// Puedes agregar otros métodos según tus necesidades, como eliminar, buscar,
	// etc.
}
