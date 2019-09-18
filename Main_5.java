import java.util.Scanner;

public class Main_5 {

	public static void main(String[] args) {
		Scanner escaneador = new Scanner(System.in);
		String quem = escaneador.nextLine();
		boolean x = quem.compareToIgnoreCase("fernando") == 0 ? true : false;

		if( x == true) {
		System.out.println("Sim, mestre");
		} else {
			System.out.println("Vai Trabalhar");
		}
		
		escaneador.close();
		
	}

}
