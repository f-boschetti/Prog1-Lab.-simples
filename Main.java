import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int imprimir = teclado.nextInt();
		System.out.print("Você digitou ");
		System.out.println(imprimir);
		teclado.close();
		

	}

}