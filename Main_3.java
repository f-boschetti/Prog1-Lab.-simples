import java.util.Scanner;

public class Main_3 {

	public static void main(String[] args) {
		Scanner escanear = new Scanner(System.in);
		System.out.print("Primeiro numero a somar ");
		double x = escanear.nextDouble();
		System.out.print("Segundo numero a somar ");
		double y = escanear.nextDouble();
		System.out.println(x + y);
		escanear.close();
		
	}

}