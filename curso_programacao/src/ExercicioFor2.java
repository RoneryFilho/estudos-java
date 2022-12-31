import java.util.Scanner;

public class ExercicioFor2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int quant, num, in = 0, out = 0;

		quant = sc.nextInt();

		for (int i = 0; i < quant; i++) {
			num = sc.nextInt();
			if (num < 10 || num > 20) {
				out++;
			} else {
				in++;
			}
		}

		System.out.printf("%d in\n", in);
		System.out.printf("%d out", out);

		sc.close();
	}
}