import java.util.Scanner;

public class Main_2 {

	public static void main(String[] args) {
		System.out.println("Oi, qual seu nome?");
		Scanner escanear = new Scanner(System.in);
		String nome = escanear.nextLine();
		System.out.print(nome);
		System.out.println(" a UFFS é a melhor!");
		escanear.close();
		
	}

}
