package introducaoInterfaceSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class ProgramLinkedHashSet {

	public static void main(String[] args) {

		Set<String> strings = new LinkedHashSet<>();
		strings.add("TV");
		strings.add("Notebook");
		strings.add("Tablet");

		boolean containsNotebook = strings.contains("Notebook");

		System.out.println("====================================");
		System.out.print("Existe na lista a plavra NOTEBOOK? ");
		System.out.println(containsNotebook);

		System.out.println("====================================");
		strings.forEach(string -> System.out.println(string));


		System.out.println("====================================");
		strings.removeIf(string -> string.length() >= 3);
		strings.forEach(string -> System.out.println(string));
		System.out.println("====================================");

	}
}
