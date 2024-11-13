package area;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double radio = -1;
		do {
			System.out.print("Introduce el radio del círculo: ");
			if (!sc.hasNextDouble()) {
				sc.nextLine();
				continue;
			}
			radio = sc.nextDouble();
			sc.nextLine();
		} while(radio < 0);
		
		double area = Math.PI * Math.pow(radio, 2);
		System.out.println("El area es: " + area);
		
		sc.close();

	}

}
