package application;

import java.io.File;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		File[] folders = path.listFiles(File::isDirectory /*checa se o item é um diretório*/); // retorna os diretórios
		
		System.out.println("Folders: ");
		for(File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); // retorna os arquivos

		System.out.println("Files: ");
		for(File file : files) {
			System.out.println(file);
		}
		
		//criando uma pasta no destino
		boolean sucesso = new File(strPath + "\\subPasta").mkdir();
		System.out.println("Directory created successfully: " + sucesso);
		
		sc.close();
	}
}
