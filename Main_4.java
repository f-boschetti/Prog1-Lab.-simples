import java.util.Scanner;

public class Main_4 {

	public static void main(String[] args) {
		System.out.println("Digita ai que eu conto");
		Scanner escaneador = new Scanner(System.in);
		String frase = escaneador.nextLine();
		String[] palavrasSeparadas = frase.split(" ");
		int a = palavrasSeparadas.length;
		System.out.println(a);
		escaneador.close();
	}

}
