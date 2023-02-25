package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		Map<String, Integer> totalVotes = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {

				String[] fields = line.split(",");
				String name = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if (totalVotes.containsKey(name)) {
					int votesSoFar = totalVotes.get(name);
					totalVotes.put(name, votes + votesSoFar);
				} else {
					totalVotes.put(name, votes);
				}
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		
		for(String key : totalVotes.keySet()) {
			System.out.printf("%s , %d\n", key, totalVotes.get(key));
		}
		
		sc.close();
	}

}
