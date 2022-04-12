package introducaoInterfaceSet;

import java.util.HashSet;
import java.util.Set;

public class ProgramHashSet {

	public static void main(String[] args) {

		Set<String> strings = new HashSet<>();

		strings.add("TV");
		strings.add("Notebook");
		strings.add("Tablet");

		// verifica se existe a string desejada
		boolean containsNotebook = strings.contains("Notebook");
		System.out.println("==================================");

		System.out.print("Existe na lista a plavra NOTEBOOK? ");
		// imprimir na tela o resultado da verificação
		System.out.println(containsNotebook);

		System.out.println("==================================");
		System.out.println("Lista de Nomes contido no SET");
		System.out.println("==================================");
		// imprimir os itens do set
		strings.forEach(string -> System.out.println(string));
		System.out.println("==================================");

	}
}
