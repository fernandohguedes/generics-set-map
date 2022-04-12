package introducaoInterfaceSet.exercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Program {

	public static void main(String[] args) {
		String path = "C:\\projetos\\generics-set-map\\src\\introducaoInterfaceSet\\exercicios\\arquivos\\logs.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
			Set<LogUser> logUsers = new HashSet<>();
			String line = bufferedReader.readLine();

			while (Objects.nonNull(line)){
				String[] fields = line.split(" ");
				String userName = fields[0];
				Date momentt = Date.from(Instant.parse(fields[1]));

				logUsers.add(new LogUser(userName, momentt));

				line = bufferedReader.readLine();
			}

			System.out.println("====================================");
			System.out.println("Total de logs registrados: " + logUsers.size());
			System.out.println("====================================");
			logUsers.forEach(logUser -> System.out.println(logUser));
			System.out.println("====================================");

		} catch (IOException exception) {
			System.out.println("Error: " + exception.getMessage());
		}
	}
}
