package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> courseA = new HashSet<>();
		Set<Integer> courseB = new HashSet<>();
		Set<Integer> courseC = new HashSet<>();
		
		System.out.print("How many students for course A?");
		int quantity = sc.nextInt();
		
		for(int i = 0; i< quantity; i++) {
			int aluno = sc.nextInt();
			courseA.add(aluno);
		}
		
		System.out.print("How many students for course B?");
		quantity = sc.nextInt();
		
		for(int i = 0; i< quantity; i++) {
			int aluno = sc.nextInt();
			courseB.add(aluno);
		}
		
		System.out.print("How many students for course C?");
		quantity = sc.nextInt();
		
		for(int i = 0; i< quantity; i++) {
			int aluno = sc.nextInt();
			courseC.add(aluno);
		}
		
		Set<Integer> totalAlunos = new HashSet<>(courseA);
		totalAlunos.addAll(courseB);
		totalAlunos.addAll(courseC);
		
		System.out.printf("Total students: %d", totalAlunos.size());
		
		sc.close();
	}

}
