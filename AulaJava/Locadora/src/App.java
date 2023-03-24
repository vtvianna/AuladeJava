import java.util.ArrayList;
import java.util.List;

import entidades.Usuario;

public class App {

	public static void main(String[] args) {
	System.out.println("Ola, sou um programa de locadora!");
	
	List lista = new ArrayList<Usuario>(); 
	
	Usuario x = new Usuario();
	x.setNome("Ananias");
	lista.add(x);
	
	Usuario y = new Usuario();
	y.setNome("João");
	lista.add(y);
	
	Usuario w = new Usuario("Bernardo");
	lista.add(w);
	
	Usuario z = new Usuario("Gabriele");
	
	imprimir(lista);
	
	}
	
	public static void imprimir(List<Usuario> lista) {
		for(Usuario u: lista) {
			System.out.println("Nome" + u.getNome());
		}
	}
	
}


