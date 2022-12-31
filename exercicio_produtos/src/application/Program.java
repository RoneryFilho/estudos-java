package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> items = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.printf("Product #%d data:\n", i + 1);
			System.out.print("Common, used or imported? (c/u/i)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if (ch == 'c') {
				items.add(new Product(name, price));
			} else if (ch == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date date = sdf.parse(sc.next());
				items.add(new UsedProduct(name, price, date));
			} else if (ch == 'i') {
				System.out.print("Customs fee: ");
				double fee = sc.nextDouble();
				items.add(new ImportedProduct(name, price, fee));
			}
		}
		
		System.out.println();
		System.out.println("PRICE TAGS: ");
		for (Product prod : items) {
			System.out.println(prod.priceTag());
		}

			sc.close();
	}
}
