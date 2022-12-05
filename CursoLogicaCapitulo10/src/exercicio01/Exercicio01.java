package exercicio01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite as tarefas do dia ou digite X para finalizar");

		ArrayList<String> linhas = new ArrayList<String>();

		String tarefa;
		int i = 0;
		while (true) {
			System.out.print("Tarefa " + (i + 1) + ": ");
			tarefa = scanner.nextLine();

			if ("x".equals(tarefa)) {
				break;
			}

			linhas.add(tarefa);
			i++;

		}

		escreverNoArquivo("D:/Java/capitulo10/exercicio01/arquivo.txt", linhas);

		scanner.close();

		System.out.println("Fim...");
	}

	static void escreverNoArquivo(String arquivo, ArrayList<String> linhas) throws IOException {
		Path path = Paths.get(arquivo);
		Files.write(path, linhas);
	}

}
