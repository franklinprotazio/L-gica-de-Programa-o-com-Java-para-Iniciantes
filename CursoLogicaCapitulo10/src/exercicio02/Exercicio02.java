package exercicio02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercicio02 {

	public static void main(String[] args) throws IOException {
		List<String> linhas = lerDoArquivo("D:/Java/capitulo10/exercicio01/arquivo.txt");
		
//		List<String> linhas = Files.readAllLines(arquivo);
		
		for(int i = 0; i < linhas.size(); i++) {
			String nome = linhas.get(i);
			
			System.out.println("Tarefa " + (i + 1) + ": " + nome);
		}
	}

	static List<String> lerDoArquivo(String arquivo) throws IOException {
		Path path = Paths.get(arquivo);
		return Files.readAllLines(path);
				
	}
	
}
